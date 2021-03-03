package com.kapilfreeman.vehiclesearch.service;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.kapilfreeman.vehiclesearch.model.Vehicle;
import com.kapilfreeman.vehiclesearch.model.VehicleFeature;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@JsonComponent
public class VehicleFeatureSerializerAndDeserializer {

    public static class VehicleFeatureDeserializer extends JsonDeserializer<VehicleFeature>{

        @Override
        public VehicleFeature deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            ObjectCodec oc = jsonParser.getCodec();
            JsonNode node = oc.readTree(jsonParser);
            String exterior= node.get("Exterior").toString();
            //exterior = exterior.replaceAll("[^a-zA-Z]", "");
            String interior=node.get("Interior").toString();
            //interior = interior.replaceAll("[^a-zA-Z]", "");
            return new VehicleFeature(exterior,interior);
        }
    }

    public static class VehicleFeatureSerializer extends JsonSerializer<VehicleFeature>{

        @Override
        public void serialize(VehicleFeature vehicleFeature, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
//
            jsonGenerator.writeStartObject();

            //for exterior
            jsonGenerator.writeFieldName("Exterior");
            jsonGenerator.writeObject(getFeatureAsList(vehicleFeature.getExterior()));


            //for interior
            jsonGenerator.writeFieldName("Interior");
            jsonGenerator.writeObject(getFeatureAsList(vehicleFeature.getInterior()));


            jsonGenerator.writeEndObject();
        }

        private Object getFeatureAsList(String s) {
            s = s.replaceAll("\\[", "").replaceAll("\\]","").replaceAll("\"", "");
            List<String> myList = new ArrayList<String>(Arrays.asList(s.split(",")));
            return myList;

        }

//        private List<String> getFeature(String exterior) {
//        }
    }





}
