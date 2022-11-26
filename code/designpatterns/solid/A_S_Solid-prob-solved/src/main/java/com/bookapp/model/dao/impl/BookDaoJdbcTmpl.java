package com.bookapp.model.dao.impl;

import java.sql.Connection;

import com.bookapp.model.dao.Book;
import com.bookapp.model.dao.BookDao;
import com.bookapp.model.dao.factories.JdbcConnectionFactory;

public class BookDaoJdbcTmpl implements BookDao{

	private Connection connection;
	
	public BookDaoJdbcTmpl() {
		this.connection=JdbcConnectionFactory.getConnection();
	}
	
	@Override
	public void addBook(Book book) {
		System.out.println("add book using jdbc");
	}

}
