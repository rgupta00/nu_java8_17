package com.bankapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bankapp.dao.Account;
import com.bankapp.dao.AccountDao;

@SpringBootApplication
public class Bankapp01Application implements CommandLineRunner {

	@Autowired
	private AccountDao accountDao;
	
	public static void main(String[] args) {
		SpringApplication.run(Bankapp01Application.class, args);

		
	}

	@Override
	public void run(String... args) throws Exception {
//		accountDao.save(new Account("anita", 1000.00,"6633445566","anita@gmail.com"));
//		accountDao.save(new Account("ravi", 1000.00,"6633445500","ravi.kr@gmail.com"));
//		System.out.println("---------added----------");
		
	}

}
