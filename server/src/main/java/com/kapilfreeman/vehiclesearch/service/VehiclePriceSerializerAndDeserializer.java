package com.kapilfreeman.vehiclesearch.service;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.kapilfreeman.vehiclesearch.model.VehiclePrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;
import java.text.DecimalFormat;

@JsonComponent
public class VehiclePriceSerializerAndDeserializer {

        public static class VehiclePriceSerializer extends JsonSerializer<VehiclePrice>{


        @Override
        public void serialize(VehiclePrice vehiclePrice, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            jsonGenerator.writeStartObject();

            jsonGenerator.writeStringField(
                    "MSRP", getPriceAsString(vehiclePrice.getMSRP()));
            jsonGenerator.writeStringField(
                    "Savings", getPriceAsString(vehiclePrice.getSavings()));
            jsonGenerator.writeStringField(
                    "finalPrice", getPriceAsString(vehiclePrice.getFinalPrice()));
            jsonGenerator.writeEndObject();
        }
        private static String getPriceAsString(double price){
            DecimalFormat formatter = new DecimalFormat("#,###.00");
            String p=formatter.format(price);
            StringBuilder s=new StringBuilder(p);
            s.insert(0,"$");
            return s.toString();
        }
    }
    public static class VehiclePriceDeSerializer extends JsonDeserializer<VehiclePrice> {
        //Change price value to required value to save in database

        @Override
        public VehiclePrice deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            ObjectCodec oc = jsonParser.getCodec();
            JsonNode node = oc.readTree(jsonParser);
            //TreeNode treeNode = jsonParser.getCodec().readTree(jsonParser);
            String M = node.get("MSRP").asText(); //For MSRP
            String S = node.get("Savings").asText();
            String F = node.get("finalPrice").asText();

            double MSRP = getPriceAsDouble(M);
            double Savings = getPriceAsDouble(S);

            double finalPrice = getPriceAsDouble(F);
            //VehiclePrice vehiclePrice = new VehiclePrice();
            return new VehiclePrice(MSRP, Savings, finalPrice);


        }
        private static double getPriceAsDouble(String price){
            return Double.parseDouble(price.replaceAll("[^\\d.]", ""));
        }
    }
}

