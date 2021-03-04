package com.kapilfreeman.vehiclesearch.controller;

import com.amazonaws.services.route53.model.InvalidInputException;
import com.amazonaws.util.json.JSONObject;
import com.kapilfreeman.vehiclesearch.model.Vehicle;
import com.kapilfreeman.vehiclesearch.model.VehicleInformation;
import com.kapilfreeman.vehiclesearch.service.VehicleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;

@RestController
@Slf4j

public class VehicleController {

    @Autowired
    private VehicleService vehicleService;


    @RequestMapping(value = "/POST/vehicleInformation/submitVehicle",method = RequestMethod.POST)
    public ResponseEntity<Object> saveVehicles(@RequestBody VehicleInformation vehicle){

         vehicleService.saveVehicles(vehicle);
         return ResponseEntity.status(HttpStatus.OK)
                .body("Vehicles Information Sumbitted Successfully " );
    }

    @RequestMapping(value = "GET/getVehicleInformation",method = RequestMethod.GET)
    public List<VehicleInformation> getVehicleInformation( ){
        return vehicleService.showAllVehicle();
    }

//    @RequestMapping(value = "GET/getVehicleModelName/{modelName}",method = RequestMethod.GET)
//    public List<VehicleInformation> findVehicleByModelName(@PathVariable("modelName") String model ){
//        return vehicleService.findVehicleByModel(model);
//    }
    @RequestMapping(value = "GET/getVehicleModelName/{modelName}",method = RequestMethod.GET)
    public List<Vehicle> findByModel(@PathVariable("modelName") String model ){
        return vehicleService.findVehicleByModelName(model);
    }

    @RequestMapping(value = "GET/getVehiclePrice/{From}/{To}",method = RequestMethod.GET)
    public List<Vehicle> findByPrice( @PathVariable String From, @PathVariable String To){
        double start=Double.parseDouble(From.replaceAll("[^\\d.]", ""));
        double end=Double.parseDouble(To.replaceAll("[^\\d.]", ""));
        return vehicleService.findVehicleByPriceRange(start,end);
    }
    @RequestMapping(value = "GET/getVehicleByFeatures/{exterior}/{interior}",method = RequestMethod.GET)
    public List<Vehicle> findByFeatures( @PathVariable String exterior, @PathVariable String interior){
        if (interior.length()<4 || exterior.length()<4) throw new InvalidInputException("Length of exterior and interior should be greater than 3");
        return vehicleService.findVehicleByFeatures(exterior,interior);
    }




}
