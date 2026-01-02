package com.polymorphismandencapsulation.employeemanagement;

public class FullTimeEmployee extends Employee{

	public FullTimeEmployee(int employeeId, String employeeName, double baseSalary) {
		super(employeeId, employeeName, baseSalary);
	}

	@Override
	public double calculateSalary() {
		return getBaseSalary();
		
	}

	
}
