package com.bankapp.service;

import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService{

	@Override
	public void sendEmail(String emailId) {
		System.out.println("email is send : "+ emailId);
	}

}
