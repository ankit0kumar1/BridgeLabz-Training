package com.polymorphismandencapsulation.vehicalrentalsystem;

public class Truck extends Vehicle implements Insurable {

	// Constructor
	public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
		super(vehicleNumber, "Truck", rentalRate, insurancePolicyNumber);
	}

	// Rental cost calculation for truck
	@Override
	public double calculateRentalCost(int days) {
		return days * getRentalRate() + 2000; // additional heavy vehicle charge
	}

	// Insurance calculation for truck
	@Override
	public double calculateInsurance() {
		return 3000;
	}

	// Insurance details
	@Override
	public String getInsuranceDetails() {
		return "Truck Insurance | Policy: " + getMaskedPolicyNumber();
	}
}
