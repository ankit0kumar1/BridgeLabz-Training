package com.inheritance.transportsystem;

public class Motorcycle extends Vehicle {

	private boolean hasCarrier;

	public Motorcycle(int maxSpeed, String fuelType, boolean hasCarrier) {
		super(maxSpeed, fuelType);
		this.hasCarrier = hasCarrier;
	}

	@Override
	public void displayInfo() {
		System.out.println("Vehicle Type: Motorcycle");
		super.displayInfo();
		System.out.println("Carrier Available: " + hasCarrier);
		System.out.println("---------------------------");
	}
}