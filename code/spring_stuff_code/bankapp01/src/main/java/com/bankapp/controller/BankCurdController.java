package com.bankapp.controller;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.dao.Account;
import com.bankapp.service.AccountService;

@RestController
public class BankCurdController {
	
	private AccountService accountService;

	@Autowired
	public BankCurdController(AccountService accountService) {
		this.accountService = accountService;
	}
	
	
	//getall accounts
	@GetMapping(path = "accounts")
	public List<Account> getAllAccounts(){
		return accountService.getAll();
	}
	
	@GetMapping(path = "accounts/{id}")
	public Account getAnAccount(@PathVariable(name = "id")  int id){
		return accountService.getById(id);
	}
	

}
