package com.kapilfreeman.vehiclesearch.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "make",
        "model",
        "modelYear",
        "bodyStyle",
        "engine",
        "drivetype",
        "color",
        "MPG",
        "vehicleFeature",
        "vehiclePrice"
})
public class VehicleDetails {
    @JsonProperty("make")
    private String make;
    @JsonProperty("model")
    private String model;
    @JsonProperty("modelYear")
    private String modelYear;
    @JsonProperty("bodyStyle")
    private String bodyStyle;
    @JsonProperty("engine")
    private String engine;
    @JsonProperty("drivetype")
    private String drivetype;
    @JsonProperty("color")
    private String color;
    @JsonProperty("MPG")
    private String MPG;
    @JsonProperty("vehicleFeature")
    private VehicleFeature vehicleFeature;
    @ElementCollection
    @JsonProperty("vehiclePrice")
    private List<VehiclePrice> vehiclePrice;
}
