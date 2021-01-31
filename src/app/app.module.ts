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





@NgModule({
  declarations: [
    AppComponent,
    RegistrationFormComponent,
    LoginFormComponent,
    CreditCardApplicationComponent,
    DebitCardApplicationComponent
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
