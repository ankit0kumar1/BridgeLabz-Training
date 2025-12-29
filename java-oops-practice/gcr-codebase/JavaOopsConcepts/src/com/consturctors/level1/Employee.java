package com.consturctors.level1;

public class Employee {
	public int employeeID;
	protected  String department;
	private double salary;
	
	//Constructor
	Employee(int employeeID, String department , double salary){
		this.employeeID = employeeID;
		this.salary = salary;
		this.department = department;
	}
	//method to set salary
	public void setSalary(double salary) {
		this.salary = salary;
	}
	//method to get salary
	public double getSalary() {
		return this.salary;
	}
}
