import { Component, OnInit } from '@angular/core';
import { FormsModule} from '@angular/forms';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {
  OrderId="1"
  StockName="DBS"
  OrderType="Limit"
  Price=10
  Quantity=10
  orderstatus=false
  Marketstatus=true
  constructor() { }

  ngOnInit(): void {
    
  }
  handleplaceorder()
  {
    new orders(this.StockName,this.OrderType,this.Price,this.Quantity);
    window.alert("order is placed successfully !");
    this.orderstatus=true;
  }

}
export class orders {
  constructor( public StockName: string, public OrderType: string, public Price: Number,public Quantity: number) {
   }
}
