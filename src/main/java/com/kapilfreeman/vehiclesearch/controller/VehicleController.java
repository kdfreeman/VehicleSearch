package com.kapilfreeman.vehiclesearch.controller;

import com.kapilfreeman.vehiclesearch.model.VehicleInformation;
import com.kapilfreeman.vehiclesearch.model.Vehicles;
import com.kapilfreeman.vehiclesearch.repository.VehicleRepository;
import com.kapilfreeman.vehiclesearch.service.VehicleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j

public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @RequestMapping(value = "/POST/vehicleInformation/submitVehicle",method = RequestMethod.POST)
    public VehicleInformation saveVehicles(@RequestBody VehicleInformation vehicle){
        return vehicleService.saveVehicles(vehicle);
    }


}