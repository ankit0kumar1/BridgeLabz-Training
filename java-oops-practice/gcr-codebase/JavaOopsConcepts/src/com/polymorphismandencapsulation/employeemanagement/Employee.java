package com.polymorphismandencapsulation.employeemanagement;

public abstract class Employee implements Department{
	private int employeeId;
	private String employeeName;
	private double baseSalary;
    private String department;
	
	public Employee(int employeeId, String employeeName , double baseSalary) {
		this.employeeId= employeeId;
		this.employeeName = employeeName;
		this.baseSalary = baseSalary;
		
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public abstract double calculateSalary();
	
	public void displayDetails() {
		System.out.println("Employee id: " + employeeId);
		System.out.println("Employee name: " + employeeName);
		System.out.println("Employee Salary: " + calculateSalary());
	}
	
	 // Interface implementation
    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
	
}
