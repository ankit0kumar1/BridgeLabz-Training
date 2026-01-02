package com.polymorphismandencapsulation.vehicalrentalsystem;

public class Bike extends Vehicle implements Insurable {

	// Constructor
	public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
		super(vehicleNumber, "Bike", rentalRate, insurancePolicyNumber);
	}

	// Rental cost calculation for bike
	@Override
	public double calculateRentalCost(int days) {
		return days * getRentalRate();
	}

	// Insurance calculation for bike
	@Override
	public double calculateInsurance() {
		return 500;
	}

	// Insurance details
	@Override
	public String getInsuranceDetails() {
		return "Bike Insurance | Policy: " + getMaskedPolicyNumber();
	}
}