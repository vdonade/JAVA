import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListComponent } from './admindashboard/list/list.component';
import { AddproductComponent } from './admindashboard/addproduct/addproduct.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { OrderComponent } from './order/order.component';
import { CartComponent } from './cart/cart.component';
import { UserloginComponent } from './userlogin/userlogin.component';
import { SearchproductComponent } from './searchproduct/searchproduct.component';
import { ForgetpasswordComponent } from './forgetpassword/forgetpassword.component';
import { SuccessfulComponent } from './successful/successful.component';


@NgModule({
  declarations: [
    AppComponent,
    ListComponent,
    AddproductComponent,
    AdminloginComponent,
    AdmindashboardComponent,
    OrderComponent,
    CartComponent,
    UserloginComponent,
    SearchproductComponent,
    ForgetpasswordComponent,
    SuccessfulComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
