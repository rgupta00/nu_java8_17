package com.bookapp.controller;

import com.bookapp.model.dao.Book;
import com.bookapp.model.service.BookService;
import com.bookapp.model.service.BookServiceImpl;

public class Main {

	public static void main(String[] args) {
		BookService bookService=new BookServiceImpl();
		bookService.addBook(new Book());
	}
}
