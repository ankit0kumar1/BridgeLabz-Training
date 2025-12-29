package com.consturctors.level1;

public class BookLibrarySystem {
	public String ISBN;
	protected String title;
	private String author;
	
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return this.author;
	}
	public BookLibrarySystem(String author, String title, String ISBN) {
		this.author= author;
		this.title = title;
		this.ISBN = ISBN;
	}
}
