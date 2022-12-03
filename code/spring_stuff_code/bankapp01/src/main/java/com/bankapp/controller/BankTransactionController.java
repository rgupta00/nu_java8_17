package com.bankapp.controller;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.dao.Account;
import com.bankapp.dto.DepositDto;
import com.bankapp.dto.TransferDto;
import com.bankapp.dto.WithdrawDto;
import com.bankapp.service.AccountService;

@RestController
public class BankTransactionController {
	
	private AccountService accountService;

	@Autowired
	public BankTransactionController(AccountService accountService) {
		this.accountService = accountService;
	}
	
	//fund transfer
	@PostMapping(path = "transfer")
	public String fundTransfer(@RequestBody  TransferDto transferDto) {
		accountService.transfer(transferDto.getFromAccId(), transferDto.getToAccId(), transferDto.getAmount());
		return "fund transfer successfully";
	}
	//withdraw
	@PostMapping(path = "withdraw")
	public String fundWithdraw(@RequestBody  WithdrawDto withdrawDto) {
		accountService.withdraw(withdrawDto.getId(), withdrawDto.getAmount());
		return "fund withdraw successfully";
	}
	
	//deposit
	
	@PostMapping(path = "deposit")
	public String fundDeposit(@RequestBody DepositDto depositDto) {
		accountService.deposit(depositDto.getId(), depositDto.getAmount());
		return "fund deposit successfully";
	}
	
	
	

}
