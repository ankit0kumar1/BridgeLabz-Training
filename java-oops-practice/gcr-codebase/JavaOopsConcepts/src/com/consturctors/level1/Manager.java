package com.consturctors.level1;

class Manager extends Employee {
    private String role;
    public Manager(int employeeID, String department, double salary, String role) {
        super(employeeID, department, salary);
        this.role = role;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);   
        System.out.println("Department: " + department);    
        System.out.println("Salary: " + getSalary());       
        System.out.println("Role: " + role);
    }
}
