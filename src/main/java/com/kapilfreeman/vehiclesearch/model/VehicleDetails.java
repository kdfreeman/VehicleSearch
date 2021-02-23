package com.kapilfreeman.vehiclesearch.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.util.ArrayList;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class VehicleDetails {

    private String make;
    private String model;
    private String modelYear;
    private String bodyStyle;
    private String engine;
    private String drivetype;
    private String color;
    private String MPG;
}
