package restful.model;

public class Vehicle {
	private int vehicleId;
	private VehicleDetails vehicleDetails;
	private VehicleFeature vehicleFeature;
	private VehiclePrice vehiclePrice;

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public VehicleDetails getVehicleDetails() {
		return vehicleDetails;
	}

	public void setVehicleDetails(VehicleDetails vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}

	public VehicleFeature getVehicleFeature() {
		return vehicleFeature;
	}

	public void setVehicleFeature(VehicleFeature vehicleFeature) {
		this.vehicleFeature = vehicleFeature;
	}

	public VehiclePrice getVehiclePrice() {
		return vehiclePrice;
	}

	public void setVehiclePrice(VehiclePrice vehiclePrice) {
		this.vehiclePrice = vehiclePrice;
	}

}
