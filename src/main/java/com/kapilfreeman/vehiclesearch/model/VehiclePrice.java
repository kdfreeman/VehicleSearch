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


//    public VehiclePrice() {
//
//    }
//    public VehiclePrice(String MSRP, String savings, String finalPrice) {
//        this.MSRP = MSRP;
//        Savings = savings;
//        this.finalPrice = finalPrice;
//    }
//
//    public String getMSRP() {
//        return MSRP;
//    }
//
//    public String getSavings() {
//        return Savings;
//    }
//
//    public String getFinalPrice() {
//        return finalPrice;
//    }
//
//
//
//    public void setMSRP(String MSRP) {
//        this.MSRP = MSRP;
//    }
//
//    public void setSavings(String savings) {
//        Savings = savings;
//    }
//
//    public void setFinalPrice(String finalPrice) {
//        this.finalPrice = finalPrice;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    @Id
//    public Long getId() {
//        return id;
//    }
}
