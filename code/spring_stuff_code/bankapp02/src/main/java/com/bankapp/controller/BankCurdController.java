package com.bankapp.controller;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.dao.Account;
import com.bankapp.dto.AccountContractDto;
import com.bankapp.service.AccountService;

@RestController
public class BankCurdController {
	
	private AccountService accountService;

	@Autowired
	public BankCurdController(AccountService accountService) {
		this.accountService = accountService;
	}
	
	
	//------get all accounts--------------
	@GetMapping(path = "accounts")
	public List<Account> getAllAccounts(){
		if(1==1)
		throw new NullPointerException();
		return accountService.getAll();
	}
	
	//------get an account--------------
	@GetMapping(path = "accounts/{id}")
	public Account getAnAccount(@PathVariable(name = "id")  int id){
		return accountService.getById(id);
	}
	
	//------add an account--------------
	@PostMapping(path = "accounts")
	public ResponseEntity<String> addAnAccount(@RequestBody  Account account){
		 accountService.addAccount(account);
		 return ResponseEntity.status(HttpStatus.CREATED).body("account is created");
	}
	
	//------update an account--------------
	@PostMapping(path = "updatedetails/{id}")
	public String updateAnAccountContact(@PathVariable(name = "id")  int id , @RequestBody  
			AccountContractDto accountContractDto){
		 accountService.updateContact(id, accountContractDto);
		 return "account contact details is updated";
	}
	
	//------delete an account--------------
	
	@DeleteMapping(path = "accounts/{id}")
	public ResponseEntity<Void> deleteAnAccount(@PathVariable(name = "id")  int id){
		 accountService.deleteAccount(id);
		 return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

}






