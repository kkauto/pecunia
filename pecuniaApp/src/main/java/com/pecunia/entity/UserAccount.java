package com.pecunia.entity;

import javax.persistence.*;

import com.pecunia.payload.Account;

@Entity
@Table (name= "ACCOUNT_INFO" )

public class UserAccount {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int accountNo;
	
	private String name;
	
	private int balance;
	
	public UserAccount() {
		super();
		
	}

	public UserAccount(String name, int balance) {
		super();
		this.name = name;
		this.balance = balance;
	}
	
	public UserAccount(Account ac)
	{
		super();
		this.name = ac.getName();
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}
