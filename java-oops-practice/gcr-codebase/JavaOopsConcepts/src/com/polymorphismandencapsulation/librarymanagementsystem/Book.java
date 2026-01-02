package com.polymorphismandencapsulation.librarymanagementsystem;

public class Book extends LibraryItem implements Reservable{
	private boolean isAvailable = true;
	public Book(int itemId, String title, String author) {
		super(itemId, title, author);
		
	}

	@Override
	int getLoanDuration() {

		return 21;
	}

	@Override
	public void reserveItem() {
		if(isAvailable) {
			isAvailable = false;
			System.out.println("Book reserved successfully.");
		}else {
			System.out.println("Book is already reserved.");
		}
		
	}

	@Override
	public boolean checkAvailability() {
		return isAvailable;
	}
	

}
