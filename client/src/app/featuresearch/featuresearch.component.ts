import { Component, OnInit } from '@angular/core';
import {Vehicle} from '../vehicle';
import {VehicleserviceService} from '../vehicleservice.service';

@Component({
  selector: 'app-featuresearch',
  templateUrl: './featuresearch.component.html',
  styleUrls: ['./featuresearch.component.css']
})
export class FeaturesearchComponent implements OnInit {

  public vehicles: Vehicle[];
  public isCollapsePrice: false;
  public isCollapseFeature: false;
  interior: string;
  exterior: string;

  constructor(private vehicleService: VehicleserviceService) {
  }

  // tslint:disable-next-line:typedef
  ngOnInit() {
    this.getVehicleByFeature();
  }

  // tslint:disable-next-line:typedef
  public getVehicleByFeature(): void {
    this.vehicleService.getVehicleByFeature(this.interior, this.exterior).subscribe(
      data => {
        this.vehicles = data;
      });

  }

}
