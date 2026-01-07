package com.eventease;

import java.time.LocalDate;

public class BirthdayEvent extends Event {

	public BirthdayEvent(String eventName, String location, LocalDate date, int attendees, User organizer) {

		super(eventName, location, date, attendees, organizer);
	}

	@Override
	public void schedule() {
		System.out.println("🎉 Birthday Event Scheduled!");
		System.out.println("Flexible timing and celebration setup.");

		// Birthday discount
		applyDiscount(1000);

		calculateTotalCost();
		System.out.println("Birthday Discount Applied: ₹1000");
		System.out.println("Total Cost: ₹" + getTotalCost());
	}
}
