package com.prarkease;

public abstract class Vehicle {

	private String vehicleNumber;

	public Vehicle(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public abstract String getVehicleType();

	public abstract double calculateCharges(int hours);
}
