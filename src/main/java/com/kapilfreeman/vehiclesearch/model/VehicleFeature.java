package com.kapilfreeman.vehiclesearch.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Getter
@Setter
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)

public class VehicleFeature {
    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //@ElementCollection
    @JsonProperty("Exterior")
    private String exterior;
//
//    //used to convert list to string of characters
//    @JsonIgnore
//    @Column(name="Exterior",insertable = false, updatable = false)
//    private String exteriorFeatureString;



    //@ElementCollection
   // @Column(name="Interior")
    @JsonProperty("Interior")
    private String interior;

    public VehicleFeature(String exterior, String interior) {
        this.exterior=exterior;
        this.interior=interior;
    }


//    //used to convert list to string of characters
//    @JsonIgnore
//    @Column(name="Interior",insertable = false, updatable = false)
//    private String interiorFeatureString;


//    public VehicleFeature(List<String> exterior, List<String> interior) {
//        Exterior = exterior;
//        Interior = interior;
//    }
//
//    public VehicleFeature() {
//
//    }
}
