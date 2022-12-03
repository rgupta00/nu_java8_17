package com.bankapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.dao.Account;
import com.bankapp.dao.AccountDao;
import com.bankapp.dto.AccountContractDto;
import com.bankapp.exception.BankAccountNotFoundExcetion;
@Service(value = "bs")
public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao;

	@Autowired
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public List<Account> getAll() {
		return accountDao.findAll();
	}

	@Override
	public Account getById(int id) {
		return accountDao.findById(id)
				.orElseThrow(()->new BankAccountNotFoundExcetion("bank account not found"));
	}

	@Override
	public void transfer(int fromAccId, int toAccId, double amount) {	
		
		Account fromAcc = getById(fromAccId);
		Account toAcc = getById(toAccId);

		fromAcc.setBalance(fromAcc.getBalance() - amount);
		toAcc.setBalance(toAcc.getBalance() + amount);

		accountDao.save(fromAcc);
		accountDao.save(toAcc);
		
	}
	

	@Override
	public void deposit(int id, double amount) {
		Account acc = getById(id);

		acc.setBalance(acc.getBalance() + amount);

		accountDao.save(acc);

	}

	@Override
	public void withdraw(int id, double amount) {
		Account acc = getById(id);

		acc.setBalance(acc.getBalance() - amount);

		accountDao.save(acc);
	}

	@Override
	public void addAccount(Account account) {
		accountDao.save(account);
	}

	@Override
	public void deleteAccount(int id) {
		Account accToDelete = getById(id);
		accountDao.delete(accToDelete);

	}

	@Override
	public void updateContact(int id, AccountContractDto accountContactDto) {
		Account accDetailsToUpdate = getById(id);
		accDetailsToUpdate.setPhoneNo(accountContactDto.getPhoneNo());
		accDetailsToUpdate.setEmail(accountContactDto.getEmail());
		accountDao.save(accDetailsToUpdate);
		
	}
	
	

}
