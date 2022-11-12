package com.day1.session1.ex2;

import java.util.Arrays;
import java.util.List;

public class DemoLambdaExpession2 {

	public static void main(String[] args) {

		List<Book> books = Arrays.asList(new Book(121, "java", "raj", 240), new Book(11, "python", "ekta", 840),
				new Book(621, "c programming", "gunika", 300));
		// all the books

		// books.stream().forEach(b-> System.out.println(b));

		//lazily
		books.stream().filter(b -> {
			System.out.println("hello");
			return b.getTitle().contains("java");
		}).forEach(b -> System.out.println(b));

	}
}
