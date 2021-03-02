package com.kapilfreeman.vehiclesearch.service;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.*;
import com.kapilfreeman.vehiclesearch.model.VehicleFeature;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;
import java.util.List;

@JsonComponent
public class VehicleFeatureSerializerAndDeserializer extends JsonDeserializer<VehicleFeature> {


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
