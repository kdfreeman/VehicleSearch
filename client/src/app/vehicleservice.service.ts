import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Vehicle} from './vehicle';
import {environment} from '../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class VehicleserviceService {
  private serverUrl = environment.apiUrl;

  constructor(private http: HttpClient) {}

  public getVehicle(): Observable<Vehicle[]>{
    return this.http. get<Vehicle[]>(`${this.serverUrl}/GET/getVehicleInformation`);
  }
}
