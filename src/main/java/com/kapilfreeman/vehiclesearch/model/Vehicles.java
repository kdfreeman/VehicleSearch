package com.kapilfreeman.vehiclesearch.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import org.springframework.context.annotation.Bean;

import javax.persistence.*;
import java.util.List;

@Data
@Getter
@Setter
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "vehicle"
})
public class Vehicles {

    @JsonProperty("vehicle")
    @ElementCollection
    private List<Vehicle> vehicle;

    }

