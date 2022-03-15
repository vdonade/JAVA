
import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  myProfile:User;

  constructor(private http: HttpClient) { }
  //call set method
  setData(userObject: User)
  {
    this.myProfile=userObject;
  }
  // call get method
  getData():User
  {
    return this.myProfile;
  }

}
