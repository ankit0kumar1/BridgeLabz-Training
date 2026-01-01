package com.objectmodeling.level1.universitymanagement;

public class RunUniversity {
	public static void main(String[] args) {
		University uni = new University("Tech University");

        // Composition
        uni.addDepartment("Computer Science");
        uni.addDepartment("Mechanical");

        // Aggregation
        Faculty f1 = new Faculty("Dr. Sharma", "Java");
        Faculty f2 = new Faculty("Dr. Mehta", "Physics");

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.showUniversityDetails();

        // Delete university
        uni.deleteUniversity();

        // Faculty still exists
        System.out.println("Faculty still exists: " + f1.getFacultyName());
	}
}
