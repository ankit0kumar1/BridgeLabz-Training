package com.smartshelf;

public class RunSmartShelf {
	public static void main(String[] args) {
		Book [] book = {
				new Book("Effective Java", "Joshua Bloch"),
				new Book("Atomic Habits", "James Clear"),
				new Book("Limitless", "Jim Kwik"),
				new Book("Mindset", "Carol"),
				
		};
		System.out.println("\nBefore sorting");
		System.out.println("----------");
		for (Book b : book) {
			b.display();
			
		}
		SmartShelf.insertionSort(book);
		System.out.println("\nAfter Sorting");
		System.out.println("----------");
		for (Book b : book) {
			b.display();
			
		}
	}
}
