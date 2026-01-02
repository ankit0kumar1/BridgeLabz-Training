package com.polymorphismandencapsulation.librarymanagementsystem;

public class LibraryTest {

	public static void main(String[] args) {
		LibraryItem item1 = new Book(1, "Java programming","james gosling");
		LibraryItem item2 = new Magazine(2, "Tech Today","Editorial team");
		LibraryItem item3 = new DVD(3, "RRR","SS.rajamouli");
		
		item1.getItemDetails();
		System.out.println("Loan duration: "+item1.getLoanDuration() + " days \n");
		item2.getItemDetails();
		System.out.println("Loan duration: "+item2.getLoanDuration() + " days \n");
		item3.getItemDetails();
		System.out.println("Loan duration: "+item2.getLoanDuration() + " days \n");
		
	}

}
