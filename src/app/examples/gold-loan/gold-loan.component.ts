import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { User } from 'app/user';
@Component({
  selector: 'app-gold-loan',
  templateUrl: './gold-loan.component.html',
  styleUrls: ['./gold-loan.component.css']
})
export class GoldLoanComponent implements OnInit {
  isFormSubmitted: boolean;
  userData:User
  constructor() { }

  ngOnInit(): void {
    this.userData=JSON.parse(sessionStorage.getItem("loggedinCustomer"));
  
  }

  




}


