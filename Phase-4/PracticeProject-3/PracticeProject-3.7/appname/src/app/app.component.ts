import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'appname';
  fname: string="Gargi";
  lname: string = "G";

  imgurl: string="./assets/images/temp.jpg";

  h=250;
  w=250;
  flag:boolean=false;

  show(){
    this.flag=!this.flag;
  }

}
