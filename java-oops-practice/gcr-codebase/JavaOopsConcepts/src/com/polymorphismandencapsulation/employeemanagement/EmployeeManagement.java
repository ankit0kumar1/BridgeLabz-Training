package com.polymorphismandencapsulation.employeemanagement;

import java.util.*;
public class EmployeeManagement {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		
		Employee e1 = new FullTimeEmployee(101, "Ankit", 50000);
		Employee e2 = new PartTimeEmployee(1021, "John", 4, 400);
		
		e1.assignDepartment("IT");
		e2.assignDepartment("Sales");
		
		e1.calculateSalary();
		e2.calculateSalary();
		
		e1.displayDetails();
		e2.displayDetails();
	}
}
