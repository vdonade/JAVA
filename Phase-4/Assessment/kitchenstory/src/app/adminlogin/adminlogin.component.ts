import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Admin } from '../admin';
import { AdminService } from '../admin.service';

@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent implements OnInit {

  constructor(private formBuilder:FormBuilder, private service:AdminService, private router:Router) { }
  adminloginForm:FormGroup;
  adminData:Admin=new Admin();
  submitted:boolean=false;



  ngOnInit(): void {
    
    this.adminloginForm= this.formBuilder.group({
      email:["",[Validators.required]],
      password:["",[Validators.required,Validators.minLength(8)]]
    })
  }
 
 onClick1(){
  this.router.navigateByUrl('/forgetpassword');

 }
  get f()
  {
    return this.adminloginForm.controls;
  }
  onSubmit()
  {
      this.submitted=true;

      if(this.adminloginForm.invalid)
        return;
      else
        {
          console.log("Email Name "+ this.adminData.email)
          console.log("Password Name "+ this.adminData.password)
          this.router.navigateByUrl('/admindashboard');
        }
  }

}
