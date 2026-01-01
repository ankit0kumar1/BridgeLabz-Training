package com.objectmodeling.level1.universitymanagement;

import java.util.*;
public class University {
    private String universityName;
    private List<Department> departments;
    private List<Faculty> faculties;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>(); // composition
        this.faculties = new ArrayList<>();   // aggregation
    }

    // COMPOSITION: University creates Departments
    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    // AGGREGATION: University accepts existing Faculty
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void showUniversityDetails() {
        System.out.println("University: " + universityName);

        System.out.println("Departments:");
        for (Department d : departments) {
            System.out.println("- " + d.getDepartmentName());
        }

        System.out.println("Faculty Members:");
        for (Faculty f : faculties) {
            System.out.println("- " + f.getFacultyName());
        }
    }

    // Simulate deletion
    public void deleteUniversity() {
        departments.clear(); // departments destroyed
        System.out.println("University deleted. All departments removed.");
    }
}
