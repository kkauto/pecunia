import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegistrationFormComponent } from './registration-form/registration-form.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { LoginFormComponent } from './login-form/login-form.component';
import { CreditCardApplicationComponent } from './credit-card-application/credit-card-application.component';
import { DebitCardApplicationComponent } from './debit-card-application/debit-card-application.component';
import { CommonModule } from '@angular/common';
import { HomeLoanApplicationComponent } from './home-loan-application/home-loan-application.component';
import { VehicleLoanApplicationComponent } from './vehicle-loan-application/vehicle-loan-application.component';
import { PersonalLoanApplicationComponent } from './personal-loan-application/personal-loan-application.component';





@NgModule({
  declarations: [
    AppComponent,
    RegistrationFormComponent,
    LoginFormComponent,
    CreditCardApplicationComponent,
    DebitCardApplicationComponent,
    HomeLoanApplicationComponent,
    VehicleLoanApplicationComponent,
    PersonalLoanApplicationComponent
  ],
  imports: [
    BrowserModule,
    CommonModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule,
  
    

  
    ],

    

  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
