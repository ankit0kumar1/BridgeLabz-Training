package com.generics.dynamiconlinemarketplace;

public class Book extends Product{

	public Book(String name, double price) {
		super(name, price);
		
	}
	@Override
	public String getCategory() {
		return "Books";
	}
	


}
