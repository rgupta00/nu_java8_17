package com.bookapp.model.service;

import com.bookapp.model.dao.Book;
import com.bookapp.model.dao.BookDao;
import com.bookapp.model.dao.impl.BookDaoJdbcTmpl;

public class BookServiceImpl implements BookService {

	private BookDaoJdbcTmpl bookDao=new BookDaoJdbcTmpl();
	
	public BookServiceImpl() {
		this.bookDao=new BookDaoJdbcTmpl();
	}
	
	@Override
	public void addBook(Book book) {
		bookDao.addBook(book);
	}

}
