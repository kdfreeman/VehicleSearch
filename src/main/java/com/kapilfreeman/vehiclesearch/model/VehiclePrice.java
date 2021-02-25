package com.kapilfreeman.vehiclesearch.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

import javax.persistence.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "MSRP",
        "Savings",
        "finalPrice"
})
public class VehiclePrice {

    @JsonProperty("MSRP")
    private String MSRP;
    @JsonProperty("Savings")
    private String Savings;
    @JsonProperty("finalPrice")
    private String finalPrice;
}
