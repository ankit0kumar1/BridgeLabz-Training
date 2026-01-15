package com.smartshelf;

public class Book {
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	void display() {
		System.out.println(title + " by " + author);
	}
}
