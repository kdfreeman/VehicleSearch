import { Component, OnInit } from '@angular/core';
import {Vehicle} from '../vehicle';
import {VehicleserviceService} from '../vehicleservice.service';

@Component({
  selector: 'app-showall',
  templateUrl: './showall.component.html',
  styleUrls: ['./showall.component.css']
})
export class ShowallComponent implements OnInit {

  public vehicles: Vehicle[];
  public isCollapsePrice: false;
  public isCollapseFeature: false;
  constructor(private vehicleService: VehicleserviceService) {}
  // tslint:disable-next-line:typedef
  ngOnInit() {
    this.getVehicles();
  }

  // tslint:disable-next-line:typedef
  public getVehicles(){
    this.vehicleService.getVehicle().subscribe(
      data => {
        this.vehicles = data;
      });



  }


}
