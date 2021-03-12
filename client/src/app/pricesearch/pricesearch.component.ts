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
  public isCollapsePrice: false;
  public isCollapseFeature: false;
  minPrice: string;
  maxPrice: string;

  constructor(private vehicleService: VehicleserviceService) {
  }

  // tslint:disable-next-line:typedef
  ngOnInit() {
    this.getVehicleByPrice();
  }

  // tslint:disable-next-line:typedef
  public getVehicleByPrice(): void {
    this.vehicleService.getVehicleByPriceRange(this.minPrice, this.maxPrice).subscribe(
      data => {
        this.vehicles = data;
      });

  }
}
