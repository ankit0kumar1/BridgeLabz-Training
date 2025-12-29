package com.consturctors.level1;

public class EBook extends BookLibrarySystem{
	EBook(String author, String title, String ISBN){
		super(author, title, ISBN);
	}
	
	public void displayDetails() {
		 System.out.println("ISBN: " + ISBN);
	     System.out.println("Title: " + title);
	     System.out.println("Author: " + getAuthor());
	}
	public static void main(String[] args) {
        // Create a Book object
		BookLibrarySystem myBook = new BookLibrarySystem("123-456-789", "Java Programming", "AAAAA");
        System.out.println("ISBN from Book: " + myBook.ISBN);
        System.out.println("Author from Book: " + myBook.getAuthor());
        EBook myEBook = new EBook("987-654-321", "Advanced Java", "FFF");
        myEBook.displayDetails();
        myEBook.setAuthor("Jane S.");
        System.out.println("Updated Author from EBook: " + myEBook.getAuthor());
	}
}
