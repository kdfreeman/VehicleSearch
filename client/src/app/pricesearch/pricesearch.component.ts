import { Component, OnInit } from '@angular/core';
import {Vehicle} from '../vehicle';
import {VehicleserviceService} from '../vehicleservice.service';

@Component({
  selector: 'app-pricesearch',
  templateUrl: './pricesearch.component.html',
  styleUrls: ['./pricesearch.component.css']
})
export class PricesearchComponent implements OnInit {

  public vehicles: Vehicle[];
  public isCollapsePrice = false;
  public isCollapseFeature = false;
  constructor(private vehicleService: VehicleserviceService) {}
  // tslint:disable-next-line:typedef
  ngOnInit() {
    this.getVehicles();
  }

  // tslint:disable-next-line:typedef
  public getVehicles(){
    this.vehicleService.getVehicle().subscribe(
      ((response: Vehicle[]) => {
        this.vehicles = response;
      }));



  }

}
