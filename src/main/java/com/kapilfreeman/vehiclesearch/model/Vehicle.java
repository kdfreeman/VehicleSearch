package com.kapilfreeman.vehiclesearch.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Vehicle {

    private int vehicleId;
    private VehicleDetails vehicleDetails;
    private VehicleFeature vehicleFeature;
    private List<VehiclePrice> vehiclePrice;

}
