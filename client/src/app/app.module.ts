import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PricesearchComponent } from './pricesearch/pricesearch.component';
import { FeaturesearchComponent } from './featuresearch/featuresearch.component';

import {VehicleserviceService} from './vehicleservice.service';
import {HttpClientModule} from '@angular/common/http';
import {FormsModule} from '@angular/forms';
import { HomepageComponent } from './homepage/homepage.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { ShowallComponent } from './showall/showall.component';
import { ModelsearchComponent } from './modelsearch/modelsearch.component';

@NgModule({
  declarations: [
    AppComponent,
    PricesearchComponent,
    FeaturesearchComponent,
    HomepageComponent,
    ShowallComponent,
    ModelsearchComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    NgbModule,


  ],
  providers: [VehicleserviceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
