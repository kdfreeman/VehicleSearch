package restful.service;

import restful.dao.VehicleDao;
import restful.model.Vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl implements VehicleService{
	@Autowired
	private VehicleDao vehicleDao;
	
	@Override
	public boolean submitVehicle(Vehicle vehicle) {
		boolean flag=false;
        try{
        	vehicleDao.submitVehicle(vehicle);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;

	}
}
