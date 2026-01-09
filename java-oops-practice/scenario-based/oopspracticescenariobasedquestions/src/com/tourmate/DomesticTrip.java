package com.tourmate;

import java.util.List;

public class DomesticTrip extends Trip {

	public DomesticTrip(String location, double budget, int numberOfDays, Transport transport, Hotel hotel,
			List<Activity> activites) {
		super(location, budget, numberOfDays, transport, hotel, activites);

	}

	@Override
	public void book() {
		// Budget validation
		double totalCost = getTotalCost();

		if (getTotalCost() <= budget) {
			System.out.println("Domestic trip booked successfully.");
		}

	}

}
