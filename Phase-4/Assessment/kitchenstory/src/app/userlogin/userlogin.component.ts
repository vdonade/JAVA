import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { User } from '../user';
import { UserService } from '../user.service';

@Component({
  selector: 'app-userlogin',
  templateUrl: './userlogin.component.html',
  styleUrls: ['./userlogin.component.css'],
  styles: [`
  h2{
    color: green;
  }`]
})
export class UserloginComponent implements OnInit {

  constructor(private formBuilder:FormBuilder, private service:UserService, private router:Router) { }
  userloginForm:FormGroup;
  userData:User=new User();
  submitted:boolean=false;

  ngOnInit(): void {
    
    this.userloginForm= this.formBuilder.group({
      email:["",[Validators.required,Validators.email]],
      password:["",[Validators.required,Validators.minLength(8)]]
    })
  }

  get f()
  {
    return this.userloginForm.controls;
  }
  onSubmit()
  {
      this.submitted=true;

      if(this.userloginForm.invalid)
        return;
      else
        {
          console.log("Email Name "+ this.userData.email)
          console.log("Password Name "+ this.userData.password)
          this.service.setData(this.userData);
          this.router.navigateByUrl('/searchproduct');
        }
  }

}
