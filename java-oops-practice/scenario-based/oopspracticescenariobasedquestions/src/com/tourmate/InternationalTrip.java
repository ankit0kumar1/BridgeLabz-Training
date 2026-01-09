package com.tourmate;

import java.util.List;

public class InternationalTrip extends Trip {

	private boolean passportValid;
	private boolean visaApproved;
	private boolean insuranceDone;

	public InternationalTrip(String location, double budget, int numberOfDays, Transport transport, Hotel hotel,
			List<Activity> activites, boolean passportValid, boolean visaApproved, boolean insuranceDone) {
		super(location, budget, numberOfDays, transport, hotel, activites);
		this.passportValid = passportValid;
		this.visaApproved = visaApproved;
		this.insuranceDone = insuranceDone;

	}

	@Override
	public void book() {
		System.out.println("Starting international trip booking...");

		//Legal checks
		if (!passportValid) {
			System.out.println("Booking failed: Passport is not valid.");
			return;
		}

		if (!visaApproved) {
			System.out.println("Booking failed: Visa not approved.");
			return;
		}

		if (!insuranceDone) {
			System.out.println("Booking failed: Travel insurance missing.");
			return;
		}

		// Budget validation
		double totalCost = getTotalCost();
		if (totalCost > budget) {
			System.out.println("Booking failed: Budget exceeded.");
			return;
		}

		// Booking order 
		System.out.println("Booking international transport...");
		System.out.println("Booking international hotel...");
		System.out.println("Booking activities...");

		System.out.println("International trip to " + location + " booked successfully!");

	}

}
