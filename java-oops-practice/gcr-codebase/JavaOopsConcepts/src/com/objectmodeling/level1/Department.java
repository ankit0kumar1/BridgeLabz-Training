package com.objectmodeling.level1;
import java.util.*;
public class Department {
	private String departmentName;
	List<Employee> employees;
	//constructor
	public Department(String departmentName) {
		this.departmentName = departmentName;
		this.employees = new ArrayList<>();
	}
	public String getDepartment() {
		return departmentName;
	}
	//create add employees in dept -> composition
	public void addEmployee(String empName, int empId) {
	    Employee emp = new Employee(empName, empId);
	    employees.add(emp);
	}
	// method to display department details
	public void displayDepartmentDetails() {
		System.out.println("Department: " + departmentName);
		
		for (Employee employee : employees) {
			employee.displayEmployee();
		}
	}
	
	
	
}
