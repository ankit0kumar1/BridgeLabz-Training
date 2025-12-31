package com.objectmodeling.level1;

public class Employee {
	private String empName;
	private int empId;
	
	public Employee(String empName, int empId) {
		this.empName = empName;
		this.empId= empId;
	}
	
	public void displayEmployee() {
        System.out.println("  Employee ID: " + empId + ", Name: " + empName);
    }

}
