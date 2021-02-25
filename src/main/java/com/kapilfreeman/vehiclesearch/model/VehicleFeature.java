package com.kapilfreeman.vehiclesearch.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Embeddable
@JsonInclude(JsonInclude.Include.NON_NULL)

public class VehicleFeature {
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //private int id;
    //@ElementCollection(targetClass=String.class)
    private String Exterior;



    //@ElementCollection(targetClass=String.class)
    private String Interior;

}
