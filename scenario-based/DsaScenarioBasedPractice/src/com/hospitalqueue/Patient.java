package com.hospitalqueue;

public class Patient {
	private String name;
	int arrivalTime;
	int criticalityLevel;

	public Patient(String name, int arrivalTime, int criticalityLevel) {
		this.name = name;
		this.arrivalTime = arrivalTime;
		this.criticalityLevel = criticalityLevel;

	}

	void display() {
		System.out.println("Patient name : " + name + "\nArrivalTime: " + arrivalTime + "\nCriticality Level : "
				+ criticalityLevel);
	}

}
