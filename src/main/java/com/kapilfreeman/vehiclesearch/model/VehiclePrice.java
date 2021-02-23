package com.kapilfreeman.vehiclesearch.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class VehiclePrice {
    private String MSRP;
    private String Savings;
    private String finalPrice;
}
