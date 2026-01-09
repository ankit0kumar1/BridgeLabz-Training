package com.tourmate;

public class Hotel {
	private String name;
	private double costPerNight;
	private int nights;
	public Hotel(String name, double costPerNight, int nights) {
		this.name = name;
		this.costPerNight= costPerNight;
		this.nights = nights;
	}
	
	private double calcualteCost() {
		return costPerNight*nights;
	}
	public double getCost() {
		return calcualteCost();
	}
	
}
