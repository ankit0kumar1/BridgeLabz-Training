package com.prarkease;

public abstract class Vehicle implements IPayable{

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
