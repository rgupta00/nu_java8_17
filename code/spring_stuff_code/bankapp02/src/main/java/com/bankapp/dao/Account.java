package com.bankapp.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "accounts_nu2")
@Data
@NoArgsConstructor
public class Account {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private double balance;
	private String phoneNo;
	private String email;
	public Account(String name, double balance, String phoneNo, String email) {
		this.name = name;
		this.balance = balance;
		this.phoneNo = phoneNo;
		this.email = email;
	}
}
