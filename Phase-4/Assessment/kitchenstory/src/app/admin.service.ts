import { Injectable } from '@angular/core';
import { Admin } from './admin';


@Injectable({
  providedIn: 'root'
})

  export class AdminService {
    Admindashboard:Admin;
    admin= {"email":"gargi","password":"gargi@123"}
    login(email:string,password:string)
    {
        if(email===this.admin.email && password===this.admin.password)
        {
          return true;
        }
        else
        return false;
    }
  
    constructor() { }
  }

