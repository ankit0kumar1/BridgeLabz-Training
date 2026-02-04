package com.collectors.employeesalarycategorization;

public class Employee {
	String name;
	String dept;
	double salary;
	public Employee(String name, String dept, double salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public double getSalary() {
		return salary;
	}
	
	
}
