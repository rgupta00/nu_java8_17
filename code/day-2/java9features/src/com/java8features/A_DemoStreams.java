package com.java8features;
import  java.util.*;
class Book {
    private int id;
    private String name;
    private String author;
    private double price;
    private int noOfPages;

    public Book(int id, String name, String author, double price, int noOfPages) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
        this.noOfPages = noOfPages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", noOfPages=" + noOfPages +
                '}';
    }
}
public class A_DemoStreams {
    public static void main(String[] args) {
        List<Book> allBooks=getAllBooks();
        allBooks.stream().filter(b->b.getName().contains("java")).forEach(System.out::println);
    }
    private static List<Book> getAllBooks() {
        List<Book> books=Arrays.asList(new Book(121, "java", "raj", 400, 778),
                new Book(1, "java adv", "raj", 350, 478),
                new Book(61, "C++", "gunika", 500, 490),
                new Book(16, "OS", "raj", 400, 300),
                new Book(121, "Linux", "amit", 600, 408)

        );
        return books;
    }
}
