package com.bookapp.model.dao.impl;

import org.hibernate.SessionFactory;

import com.bookapp.model.dao.Book;
import com.bookapp.model.dao.BookDao;
import com.bookapp.model.dao.factories.HibernateConnectionFactory;

public class BookDaoHibImpl implements BookDao{

	private SessionFactory factory;
	public BookDaoHibImpl() {
		factory=HibernateConnectionFactory.getFactory();
	}
	@Override
	public void addBook(Book book) {
		System.out.println("Add book using hibernate");
	}

}
