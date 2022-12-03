package com.bankapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.dao.Account;
import com.bankapp.dao.AccountDao;
import com.bankapp.exception.BankAccountNotFoundException;

@Service(value = "accountservice")
public class AccountServiceImpl implements AccountService{

	private AccountDao accountDao;
	
	private EmailService emailService;
	
	//@Autowired: field , setter and it can applied to ctr
	
	
	
	@Autowired
	public AccountServiceImpl(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Autowired
	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}

	@Override
	public List<Account> getAll() {
		return accountDao.getAll();
	}

	@Override
	public Account getById(int id) {
		Account account=accountDao.getById(id);
		if(account==null)
			throw new BankAccountNotFoundException("account id "+ id +" is not found");
		return account;
	}

	@Override
	public void transfer(int fromAccId, int toAccId, double amount) {
	
		Account fromAcc=accountDao.getById(fromAccId);
		Account toAcc=accountDao.getById(toAccId);
		
		fromAcc.setBalance(fromAcc.getBalance()-amount);
		toAcc.setBalance(toAcc.getBalance()+amount);
		
		accountDao.updateAccount(fromAcc);
		accountDao.updateAccount(toAcc);
		
		if(emailService!=null) {
			emailService.sendEmail("rgupta.mtech@gmail.com");
		}
		
	}

	@Override
	public void deposit(int id, double amount) {
		Account acc=accountDao.getById(id);
		acc.setBalance(acc.getBalance()+amount);
		accountDao.updateAccount(acc);
		
	}

	@Override
	public void withdraw(int id, double amount) {
		Account acc=accountDao.getById(id);
		acc.setBalance(acc.getBalance()-amount);
		accountDao.updateAccount(acc);
		
	}

	@Override
	public void addAccount(Account account) {
		//
	}

	@Override
	public void deleteAccount(int id) {
		//
	}

}



