package com.tourmate;

public class Transport {
	private String type;
	private double baseFare;
	private int distance;
	public Transport(String type, double baseFare, int distance) {
		this.type = type;
		this.baseFare = baseFare;
		this.distance = distance;
	}
	
	private double calculateCost() {
		return baseFare * distance;
	}
	
	public double getCost() {
		return calculateCost();
	}
}
