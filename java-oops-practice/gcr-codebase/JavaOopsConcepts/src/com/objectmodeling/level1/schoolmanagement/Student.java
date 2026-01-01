package com.objectmodeling.level1.schoolmanagement;
import java.util.*;
public class Student {
	private String studentName;
	private int rollNo;
	List<Course> courses;
	
	
	// Constructor
	public Student(String studentName , int rollNo) {
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.courses = new ArrayList<>();
		
	}
	public int getRollNumber() {
		return rollNo;
	}
	public void addCourse(Course course) {
		courses.add(course);    // student knows the course
		course.addStudent(this);// course knows the student 
	}
	
	public void displayStudentDetails() {
		System.out.println("Student Details:\nStudent Name : " + studentName + "\nRoll number : " + rollNo);
	}
	public void showCourses() {
		for(Course c : courses) {
			System.out.println(c.getCourseName());
		}
	}
	
}
