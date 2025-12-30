package com.objectmodeling.level1;

public class LibraryManagementApp {
	public static void main(String[] args) {
		Book b1 = new Book("Java Foundation" , "Ankit");
		Book b2 = new Book("Advanced Java", "Keshav");
		Library lib1 = new Library("Eclipse");
		//add books 
		lib1.addBook(b1);
		lib1.addBook(b2);
		//display books in the library
		lib1.displayBook();
		
	}
}
