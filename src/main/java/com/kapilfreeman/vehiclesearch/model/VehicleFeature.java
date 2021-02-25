package com.kapilfreeman.vehiclesearch.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Embeddable
@JsonInclude(JsonInclude.Include.NON_NULL)

public class VehicleFeature {
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //private int id;
    @ElementCollection
    @JsonProperty("Exterior")
    private List<String> Exterior;



    @ElementCollection
    @JsonProperty("Interior")
    private List<String> Interior;


    public VehicleFeature(List<String> exterior, List<String> interior) {
        Exterior = exterior;
        Interior = interior;
    }

    public VehicleFeature() {

    }
}
