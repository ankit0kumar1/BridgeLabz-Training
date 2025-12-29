package com.consturctors.level1;

//Create a Book class with attributes title, author, and default and parameterized constructors.
public class Book{
	private String title;
	private String author;
	private int price;
	//default constructor
	Book(){	
		this.title = "NEWEAR";
		this.author = "XYZ";
		this.price = 1000;
	}
	//parameterized constructor
	Book(String title , String author , int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
		private int getPrice(){
			return this.price;
		}
		private String getAuthor(){
			return this.author;
		}
		private String getTitle(){
			return this.title;
		}
	public String toString() {
		return "Title: " + title + ", Author: " + author + ", Price: " + price;
	}

public static void main(String[] args){
		
		Book b1 = new Book("Grow and rich", "XYZ" , 130);
		System.out.println(b1);
	}
}