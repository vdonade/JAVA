import { Component, OnInit } from '@angular/core';
import { Product } from '../Product';

@Component({
  selector: 'app-searchproduct',
  templateUrl: './searchproduct.component.html',
  styleUrls: ['./searchproduct.component.css'],

})



export class SearchproductComponent implements OnInit {
  product:Product[];
 // productSelected:number;

 //type object any
 prodSelected: any ={};


  private _flag: boolean = false;
  modifiedtext: string;
  public get flag(): boolean {
    return this._flag;
  }
  public set flag(value: boolean) {
    this._flag = value;
  }

  hide(){
    this.flag=this.flag;
  }

  show(){
    this.flag=!this.flag;
  }
  color:string="red";
we:number=700;
  constructor() { }

  ngOnInit(): void {
    this.product=[
      {id:1, name:"Mango", price:"200", description:"12 mangoes"},
      {id:2, name:"Apple", price:"300", description:"12 apples"},
      {id:3, name:"Banana", price:"150", description:"12 banana"}
    ];
  }

  productSelected(val:Product)
  {
        this.customerFunction(val);
  }
  customerFunction(val: Product) {
    this.modifiedtext= val.name + " The Selected product id is " + val.id + ",  The Selected product price is " + val.price+ ",  The Selected product description is " + val.description; 
  }
  
 
}
