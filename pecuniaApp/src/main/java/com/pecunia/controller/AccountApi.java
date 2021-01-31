package com.pecunia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pecunia.payload.Account;
import com.pecunia.service.UserAccountManage;

@RestController
@RequestMapping("/account")
public class AccountApi {
	
	@Autowired
	public UserAccountManage account;
	
	@GetMapping
	public  List<String >getAllAccountNames() {
		System.out.println("Hi");
		return account.getAllNames();
	}
	
	@GetMapping(value="/{accountNo}")
	public String getAccountDetailsWithId(@PathVariable int accountNo ) {
		System.out.println("Hi");
		return account.getAccountDetails(accountNo);
	}
	
	@PostMapping
	public void createNewAccount(@RequestBody Account ac) {
		account.createAccount(ac);
	}
}
