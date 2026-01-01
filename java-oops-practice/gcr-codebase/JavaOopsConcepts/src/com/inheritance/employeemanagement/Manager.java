package com.inheritance.employeemanagement;

public class Manager extends Employee {
	private int teamSize;

	public Manager(String name, int id, double salary, int teamSize) {
		super(name, id, salary);
		this.teamSize = teamSize;
	}

	public int getTeamSize() {
		return teamSize;
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Team size " + teamSize);
	}

}
