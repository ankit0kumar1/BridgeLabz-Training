package com.tourmate;

public class Activity {
	private String name;
	private  double cost;
	
	public double getCost() {
		return cost;
	}

	public Activity(String name, double cost) {
		this.name = name;
		this.cost = cost;
	}
}
