package com.objectmodeling.level1.schoolmanagement;
import java.util.*;
public class School {
	private String schoolName;
	List<Student> students;
	
	//Constructor
	public School(String schoolName) {
		this.schoolName = schoolName;
		this.students = new ArrayList<Student>(); 
	}
	public void addStudents(Student student) {
		students.add(student);
	}
	
	public void showStudents() {
        if (students.isEmpty()) {
            System.out.println("No students enrolled in the school.");
            return;
        }

        System.out.println("Students in " + schoolName + ":");
        for (Student s : students) {
            s.displayStudentDetails();
            System.out.println();
        }
    }
	
	
}
