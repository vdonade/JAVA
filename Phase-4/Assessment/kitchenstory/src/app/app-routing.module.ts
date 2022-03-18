import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddproductComponent } from './admindashboard/addproduct/addproduct.component';
import { ListComponent } from './admindashboard/list/list.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { UserloginComponent } from './userlogin/userlogin.component';
import { OrderComponent } from './order/order.component';
import { CartComponent } from './cart/cart.component';
import { SearchproductComponent } from './searchproduct/searchproduct.component';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';

const routes: Routes = [
  {"path":"addproduct",component:AddproductComponent},
  {"path":"list",component:ListComponent},
  {"path":"adminlogin",component:AdminloginComponent},
  {"path":"cart",component:CartComponent},
  {"path":"order",component:OrderComponent},
  {"path":"userlogin",component:UserloginComponent},
  {"path":"searchproduct",component:SearchproductComponent, 
    children:[
      {"path":"cart",component:CartComponent},
      {"path":"order",component:OrderComponent}
    ]},
  {"path":"admindashboard",component:AdmindashboardComponent},
  {"path":"**",redirectTo:'/userlogin', pathMatch:'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
