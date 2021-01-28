package restful.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import restful.model.Vehicle;
import restful.service.VehicleService;
 
@RestController
@RequestMapping(value = "/vehicle")
public class VehicleController {
	@Autowired
	private VehicleService vehicleService;
	
	@RequestMapping(value = "/submitVehicle", method = RequestMethod.POST, produces = { "application/json" })
	public boolean submitVehicle(Vehicle vehicle) {
		System.out.println("Start submitting vehicle");
		return vehicleService.submitVehicle(vehicle);
	}
}
