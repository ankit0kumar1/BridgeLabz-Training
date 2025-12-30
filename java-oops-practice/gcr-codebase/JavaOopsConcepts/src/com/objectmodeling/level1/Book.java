package com.objectmodeling.level1;

public class Book {
	private String title;
	private String author;
	
	//Constuctor
	public Book(String title, String author) {
		this.title= title;
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public void displayBookDetails() {
		System.out.println("Title " + title);
		System.out.println("Author " + author);
		
	}
	
	
}	
