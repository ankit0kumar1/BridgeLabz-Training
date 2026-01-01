package com.objectmodeling.level1.schoolmanagement;
import java.util.*;
public class Course {
	private String courseName;
	List<Student> students;
	public Course(String courseName) {
		this.courseName = courseName;
		this.students = new ArrayList<>();
		
	}
	public String getCourseName() {
		return courseName;
	}
	public void addStudent(Student student) {
		students.add(student);
	}
	public void showStudents() {
		if(students.isEmpty()) {
			System.out.println("No students enrolled in this course.");
			return;
		}
		System.out.println("Students enrolled in " +courseName + ":");
		for(Student s: students) {
			System.out.println("- Roll No: " + s.getRollNumber());
		}
		
	}
	
		
	
}
