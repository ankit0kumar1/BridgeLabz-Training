package com.parceltracker;

public class ParcelTrackerApp {
	public static void main(String[] args) {

		// Create a product (the parcel)
		Product product = new Product(101, "Laptop");

		// Create the tracker
		ParcelTracker tracker = new ParcelTracker();

		// Standard delivery stages
		tracker.addStage("Packed", product);
		tracker.addStage("Shipped", product);
		tracker.addStage("In Transit", product);

		// Final stage
		tracker.addStage("Delivered", product);

		// Track the parcel forward
		tracker.trackForward();
		
		ParcelTracker tracker2 = new ParcelTracker();
		
		Product product2 = new Product(102, "Mobile");
		tracker2.addStage("Packed", product2);
		tracker2.addStage("Shipped", product2);
		
		tracker2.trackForward();
	}
}
