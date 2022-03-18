import { Injectable } from '@angular/core';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  Order:User;

  constructor() { }
  //call get method
  setData(userObject:User)
  {
    this.Order=userObject;
  }
  getData():User
  {
    return this.Order;
  }
  
}
