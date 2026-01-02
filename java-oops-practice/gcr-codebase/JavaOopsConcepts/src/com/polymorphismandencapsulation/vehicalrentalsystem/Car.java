package com.polymorphismandencapsulation.vehicalrentalsystem;

public class Car extends Vehicle implements Insurable {

	// Constructor
	public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
		super(vehicleNumber, "Car", rentalRate, insurancePolicyNumber);
	}

	// Rental cost calculation for car
	@Override
	public double calculateRentalCost(int days) {
		return days * getRentalRate();
	}

	// Insurance calculation for car
	@Override
	public double calculateInsurance() {
		return 1500;
	}

	// Insurance details
	@Override
	public String getInsuranceDetails() {
		return "Car Insurance | Policy: " + getMaskedPolicyNumber();
	}
}