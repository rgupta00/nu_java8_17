package com.day1.session1.demo;

public class BookDto {
	private String title;
	private double price;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public BookDto(String title, double price) {
		super();
		this.title = title;
		this.price = price;
	}
	@Override
	public String toString() {
		return "BookDto [title=" + title + ", price=" + price + "]";
	}
	
	
	
}
