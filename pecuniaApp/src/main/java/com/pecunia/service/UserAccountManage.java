package com.pecunia.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pecunia.entity.UserAccount;
import com.pecunia.payload.Account;
import com.pecunia.repository.AccountRepository;

@Service
public class UserAccountManage {

	@Autowired
	private AccountRepository accountRepo;
	
	private static final Logger log = LoggerFactory.getLogger(UserAccountManage.class);
	
	public List<String> getAllNames() {
		// TODO Auto-generated method stub
		List<String> accountNames = new ArrayList<String>();
		accountRepo.findAll().forEach(account -> {accountNames.add(account.getName());});
		log.info("DETAILS SAMPLE " + accountNames.get(0));
		return accountNames;
	}
	
	public String getAccountDetails(int accountNo) {
		UserAccount ac = accountRepo.findById(accountNo);
		return ac.toString();
	}

	public void createAccount(Account ac) {
		// TODO Auto-generated method stub
		UserAccount account = new UserAccount(ac);
		log.info("Inserting ino new AccountDetials : " + account.toString());
		accountRepo.save(account);
		log.info("Successfuly created new acount for " + account.getName());	
	}

}
