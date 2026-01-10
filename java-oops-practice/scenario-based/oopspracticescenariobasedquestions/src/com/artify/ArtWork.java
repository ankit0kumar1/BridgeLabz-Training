package com.artify;

public abstract class ArtWork implements IPurchasable {

	private String title;
	private String artist;
	private double price;
	protected String licenseType;

	// Constructor
	public ArtWork(String title, String artist, double price) {
		this.title = title;
		this.artist = artist;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void purchase(User user) {
		if (user == null) {
			System.out.println("Invalid user.");
			return;
		}

		if (user.getBalance() < price) {
			System.out.println("Insufficient wallet balance.");
			return;
		}

		// operator usage: deduct balance
		user.deductAmount(price);

		applyLicense();

		System.out.println("Purchase successful: \"" + title + "\" by " + artist);
		System.out.println("Remaining balance: ₹" + user.getBalance());
	}

	public abstract void applyLicense();
}
