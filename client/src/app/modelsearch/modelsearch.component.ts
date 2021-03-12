import { Component, OnInit } from '@angular/core';
import {Vehicle} from '../vehicle';
import {VehicleserviceService} from '../vehicleservice.service';

@Component({
  selector: 'app-modelsearch',
  templateUrl: './modelsearch.component.html',
  styleUrls: ['./modelsearch.component.css']
})
export class ModelsearchComponent implements OnInit {


  public vehicles: Vehicle[];
  public isCollapsePrice: false;
  public isCollapseFeature: false;
  model: string;
  constructor(private vehicleService: VehicleserviceService) {}
  // tslint:disable-next-line:typedef
  ngOnInit() {
    this.getVehicleByModel();
  }

  // tslint:disable-next-line:typedef
  public getVehicleByModel(): void{
    this.vehicleService.getVehicleByModelName(this.model).subscribe(
      data => {
        this.vehicles = data;
      });



  }

}
