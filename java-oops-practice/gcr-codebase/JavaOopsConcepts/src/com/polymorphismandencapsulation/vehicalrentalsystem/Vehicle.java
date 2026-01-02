package com.polymorphismandencapsulation.vehicalrentalsystem;

public abstract class Vehicle {

	// Encapsulated fields
	private String vehicleNumber;
	private String type;
	private double rentalRate;
	private String insurancePolicyNumber;

	// Constructor
	public Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
		this.vehicleNumber = vehicleNumber;
		this.type = type;
		this.rentalRate = rentalRate;
		this.insurancePolicyNumber = insurancePolicyNumber;
	}

	// Getter and Setter methods (Encapsulation)
	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getType() {
		return type;
	}

	public double getRentalRate() {
		return rentalRate;
	}

	public void setRentalRate(double rentalRate) {
		this.rentalRate = rentalRate;
	}

	// No direct getter for insurance policy number (restricted access)
	protected String getMaskedPolicyNumber() {
		return "XXXX-" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
	}

	// Abstract method to calculate rental cost
	public abstract double calculateRentalCost(int days);
}
