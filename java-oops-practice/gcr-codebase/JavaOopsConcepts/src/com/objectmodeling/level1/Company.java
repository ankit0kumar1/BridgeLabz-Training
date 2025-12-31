package com.objectmodeling.level1;
import java.util.*;
public class Company {
	private String companyName;
	List<Department>departments;
	//constructor
	public Company(String companyName) {
		this.companyName = companyName;
		this.departments = new ArrayList<>();
	}
	//create add department in company
	public void addDepartment(String departmentName) {
		Department dept = new Department(departmentName);
		departments.add(dept);
	}
	public void addEmployeeToDepartment(String departmentName, String empName, int empId) {

	    for (Department dept : departments) {
	        if (dept.getDepartment().equals(departmentName)) {
	            dept.addEmployee(empName, empId);
	            return;
	        }
	    }

	    System.out.println("Department not found: " + departmentName);
	}

	//show department details 
	public void displayCompanyDetails() {
		System.out.println("Company: " + companyName);
		for(Department dept : departments) {
			dept.displayDepartmentDetails();
		}
	}
	
}
