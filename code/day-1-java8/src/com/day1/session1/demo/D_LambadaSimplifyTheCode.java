package com.day1.session1.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.day1.session1.ex2.Book;

public class D_LambadaSimplifyTheCode {
	
	public static void main(String[] args) {
		List<Book> books=Arrays.asList
				(new Book(121, "java", "raj", 240),
						new Book(11, "python", "ekta", 840),
						new Book(621, "c programming", "gunika", 300));
		
		//i want to print the name of all books sorted as price (rev order)
		
//		books.stream()
//		.sorted(comparator.comparing(book::getprice).reversed())
//		.map(b-> b.gettitle())
//		.foreach(title-> system.out.println(title));
		
//		Collections.sort(books, new Comparator<Book>() {
//			@Override
//			public int compare(Book o1, Book o2) {
//				return Double.compare(o2.getPrice(), o1.getPrice());
//			}
//		});
//		
//		List<String> booksName=new ArrayList<>();
//		for(Book book: books) {
//			booksName.add(book.getTitle());
//		}
//		
//		for(String title: booksName)
//			System.out.println(title);
//		
		
//		
//		Collections.sort(books, (Book o1, Book o2)-> {
//				return Double.compare(o2.getPrice(), o1.getPrice());
//			
//		});
		
		//Collections.sort(books, (Book o1, Book o2)-> Double.compare(o2.getPrice(), o1.getPrice()));
		
		Collections.sort(books, ( o1,  o2)-> Double.compare(o2.getPrice(), o1.getPrice()));
		
		for(Book book: books) {
			System.out.println(book);
		}
		
	}

}
