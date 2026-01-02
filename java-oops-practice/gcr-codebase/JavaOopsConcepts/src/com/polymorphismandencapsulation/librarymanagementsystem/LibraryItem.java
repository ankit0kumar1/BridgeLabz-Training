package com.polymorphismandencapsulation.librarymanagementsystem;

public abstract class LibraryItem {
	private int itemId;
	private String title;
	private String author;
	
	//abstract method
	abstract int getLoanDuration();
	
	//concrete method
	public void getItemDetails() {
		System.out.println("Item id: " + itemId);
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
	}

	public LibraryItem(int itemId, String title, String author) {
		this.itemId = itemId;
		this.title = title;
		this.author = author;
	}
}
