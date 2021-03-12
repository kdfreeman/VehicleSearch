import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {PricesearchComponent} from './pricesearch/pricesearch.component';
import {FeaturesearchComponent} from './featuresearch/featuresearch.component';
import {HomepageComponent} from './homepage/homepage.component';
import {ShowallComponent} from './showall/showall.component';
import {ModelsearchComponent} from './modelsearch/modelsearch.component';

const routes: Routes = [
  {path: '', redirectTo: 'home', pathMatch: 'full'},
  {path: 'featuresearch', component: FeaturesearchComponent},
  {path: 'modelsearch', component: ModelsearchComponent},
  {path: 'home', component: HomepageComponent},
  {path: 'showall', component: ShowallComponent},
  {path: 'pricesearch', component: PricesearchComponent},
  {path: 'searchbyfeature', component: FeaturesearchComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
