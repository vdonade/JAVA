import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Admin } from '../admin';
import { AdminService } from '../admin.service';

@Component({
  selector: 'app-forgetpassword',
  templateUrl: './forgetpassword.component.html',
  styleUrls: ['./forgetpassword.component.css']
})
export class ForgetpasswordComponent implements OnInit {

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

 

  password: any[][];
  onClick(){
    this.password.splice(0);
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
          this.router.navigateByUrl('/successful');
        }
  }


}

