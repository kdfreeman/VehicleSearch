package com.kapilfreeman.vehiclesearch.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
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
    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
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
    @Embedded
    private VehicleFeature vehicleFeature;

    @JsonProperty("vehiclePrice")
    @OneToMany(cascade = {CascadeType.ALL})
    private List<VehiclePrice> vehiclePrice;

//    public String getMake() {
//        return make;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public String getModelYear() {
//        return modelYear;
//    }
//
//    public String getBodyStyle() {
//        return bodyStyle;
//    }
//
//    public String getEngine() {
//        return engine;
//    }
//
//    public String getDrivetype() {
//        return drivetype;
//    }
//
//    public void setMake(String make) {
//        this.make = make;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public void setModelYear(String modelYear) {
//        this.modelYear = modelYear;
//    }
//
//    public void setBodyStyle(String bodyStyle) {
//        this.bodyStyle = bodyStyle;
//    }
//
//    public void setEngine(String engine) {
//        this.engine = engine;
//    }
//
//    public void setDrivetype(String drivetype) {
//        this.drivetype = drivetype;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public void setMPG(String MPG) {
//        this.MPG = MPG;
//    }
//
//    public void setVehicleFeature(VehicleFeature vehicleFeature) {
//        this.vehicleFeature = vehicleFeature;
//    }
//
//    public void setVehiclePrice(List<VehiclePrice> vehiclePrice) {
//        this.vehiclePrice = vehiclePrice;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public String getMPG() {
//        return MPG;
//    }
//
//    public VehicleFeature getVehicleFeature() {
//        return vehicleFeature;
//    }
//
//    public List<VehiclePrice> getVehiclePrice() {
//        return vehiclePrice;
//    }
}
