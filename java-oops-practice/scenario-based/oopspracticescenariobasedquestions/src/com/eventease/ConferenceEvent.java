package com.eventease;

import java.time.LocalDate;

public class ConferenceEvent extends Event {

	public ConferenceEvent(String eventName, String location, LocalDate date, int attendees, User organizer) {

		super(eventName, location, date, attendees, organizer);
	}

	@Override
	public void schedule() {
		System.out.println("📢 Conference Event Scheduled!");
		System.out.println("Strict schedule and professional setup.");

		// No discount for conferences
		applyDiscount(0);

		calculateTotalCost();
		System.out.println("Total Cost: ₹" + getTotalCost());
	}
}
