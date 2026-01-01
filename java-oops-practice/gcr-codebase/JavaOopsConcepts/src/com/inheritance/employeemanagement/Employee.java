package com.inheritance.employeemanagement;

public class Employee {
	
	private String name;
	private int id;
	private double salary;
	
	public Employee(String name, int id, double salary) {
		
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	
	public String getName() {
		return name;
	}

	
	public int getId() {
		return id;
	}

	
	public double getSalary() {
		return salary;
	}

	public void displayDetails() {
		System.out.println("Employee Name: " + name);
		System.out.println("Employee id:  " + id);
		System.out.println("Salary: " + salary);
		System.out.println();
	}
}
