import {VehicleFeature} from './vehicle-feature';
import {VehiclePrice} from './vehicle-price';

export class VehicleDetails {
  make: string;
  model: string;
  modelYear: string;
  bodyStyle: string;
  engine: string;
  drivetype: string;
  color: string;
  MPG: string;
  vehicleFeature: VehicleFeature;
  vehiclePrice: VehiclePrice[];

}
