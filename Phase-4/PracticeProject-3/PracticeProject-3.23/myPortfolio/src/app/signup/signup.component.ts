

import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { User } from '../user';
import { UserService } from '../user.service';


@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css'],
  styles: [`
  h2{
    color: green;
  }`]
})
export class SignupComponent implements OnInit {

  constructor(private formBuilder:FormBuilder, private service:UserService, private router:Router) { }
  signupForm:FormGroup;
  userData:User=new User();
  submitted:boolean=false;

  ngOnInit(): void {

    
    this.signupForm= this.formBuilder.group({
    
      firstName:["",Validators.required],
      lastName:["",Validators.required],
      email:["",[Validators.required,Validators.email]],
      address:["",Validators.required],
    })
  }

  get f()
  {
    return this.signupForm.controls;
  }
  onSubmit()
  {
      this.submitted=true;

      if(this.signupForm.invalid)
        return;
      else
        {
          console.log("FirstName Name "+ this.userData.firstName)
          console.log("LastName Name "+ this.userData.lastName)
          console.log("Email Name "+ this.userData.email)
          console.log("Address "+ this.userData.address)
          this.service.setData(this.userData);
          this.router.navigateByUrl('/profile');
        }
  }

}
