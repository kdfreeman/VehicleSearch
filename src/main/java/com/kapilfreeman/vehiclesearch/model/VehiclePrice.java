package com.kapilfreeman.vehiclesearch.model;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "MSRP",
        "Savings",
        "finalPrice"
})
public class VehiclePrice {
    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @JsonProperty("MSRP")
    private double MSRP;
    @JsonProperty("Savings")
    private double Savings;

    public VehiclePrice(double MSRP, double savings, double finalPrice) {
        this.MSRP = MSRP;
        Savings = savings;
        this.finalPrice = finalPrice;
    }

    @JsonProperty("finalPrice")
    private double finalPrice;

   // public VehiclePrice(double msrp, double savings, double finalPrice) {
   // }

//    public VehiclePrice(double msrp, double savings, double finalPrice) {
//    }


    // public VehiclePrice(double msrp, double savings, double finalPrice) {
   // }


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
