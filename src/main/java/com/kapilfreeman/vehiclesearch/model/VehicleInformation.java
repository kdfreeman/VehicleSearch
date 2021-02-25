package com.kapilfreeman.vehiclesearch.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

import javax.persistence.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Root")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "vehicles"
})
public class VehicleInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JsonProperty("vehicles")

    private Vehicles vehicles;


}
