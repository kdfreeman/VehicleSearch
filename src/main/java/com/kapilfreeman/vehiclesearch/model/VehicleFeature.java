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
@AllArgsConstructor
@Getter
@Setter
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)

public class VehicleFeature {
    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ElementCollection
    @JsonProperty("Exterior")
    @Column(name="Exterior")
    private List<String> exterior;

//    //used to convert list to string of characters
//    @JsonIgnore
//    @Column(name="Exterior")
//    private String exteriorlist;



    @ElementCollection
    @Column(name="Interior")
    @JsonProperty("Interior")
    private List<String> interior;

//    //used to convert list to string of characters
//    @JsonIgnore
//    @Column(name="Interior")
//    private String interiorlist;


//    public VehicleFeature(List<String> exterior, List<String> interior) {
//        Exterior = exterior;
//        Interior = interior;
//    }
//
//    public VehicleFeature() {
//
//    }
}
