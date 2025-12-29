package com.consturctors.level1;

public class EmployeeRecords {
    public static void main(String[] args) {

        Manager mgr = new Manager(
                101,
                "IT",
                75000,
                "Project Manager"
        );

        mgr.displayDetails();

        // Modify salary using public method
        mgr.setSalary(85000);
        System.out.println("Updated Salary: " + mgr.getSalary());
    }
}
