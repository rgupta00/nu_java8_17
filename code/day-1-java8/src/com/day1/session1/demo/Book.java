package com.day1.session1.demo;

public class Book {
	private int id;
	private String title;
	private String author;
	private double price;
	
	
	
	//---this method take "this" and return nothing
	public  void foo() {
		System.out.println("I");
		System.out.println("II");
		System.out.println("III");

	}
	
	public BookDto convertToBookDto() {
		return new BookDto(title, price);
	}
	
	
	public boolean isCostlyBook() {
		return price>=500;
		
	}
	
	public String costlyBookName() {
		if( price>=500)
			return title;
		else
			return "book not found";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Book(int id, String title, String author, double price) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author
				+ ", price=" + price + "]";
	}
	
	
}
