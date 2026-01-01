package com.inheritance.employeemanagement;

public class EmployeeTest {
	public static void main(String[] args) {
		Developer dev = new Developer("Ankit", 1027, 500000, "Java");
		Manager manager = new Manager("Keshav", 4201, 700000, 7);
		Intern intern = new Intern("Aviral", 9281, 2000);
		
		dev.displayDetails();
		manager.displayDetails();
		intern.displayDetails();
	}
}
