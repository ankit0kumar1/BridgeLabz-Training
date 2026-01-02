package com.polymorphismandencapsulation.librarymanagementsystem;

public class DVD extends LibraryItem implements Reservable {

	private boolean isAvailable = true;

	public DVD(int itemId, String title, String author) {
		super(itemId, title, author);

	}

	@Override
	public void reserveItem() {
		if (isAvailable) {
			isAvailable = false;
			System.out.println("Magazine reserved successfully.");
		} else {
			System.out.println("Magazine is already reserved.");
		}

	}

	@Override
	public boolean checkAvailability() {

		return isAvailable;
	}

	@Override
	int getLoanDuration() {
		return 5;
	}

}
