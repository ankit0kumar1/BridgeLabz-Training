package com.objectmodeling.level1;
import java.util.*;
public class Library {
	private String libraryName;
	private List<Book> books;
	
	public Library(String libraryName) {
		this.libraryName = libraryName;
		this.books = new ArrayList<>();
	}
	
	// Method to add book
	public void addBook(Book book) {
		books.add(book);
		System.out.println("Book \""+ book.getTitle() + "\"added to " + libraryName);
	}
	
	// Method to display  all the books in library
	public void displayBook() {
		System.out.println("Books in " + libraryName + ":");
		if(books.isEmpty()) {
			System.out.println("No books available.");
		}
		for(Book book : books) {
			book.displayBookDetails();
			System.out.println("-----------------------");
		}
	}
	
	
}
