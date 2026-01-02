package com.inheritance.multilevelinheritance;

public class RunCourse {
	public static void main(String[] args) {

		PaidOnlineCourse course = new PaidOnlineCourse("Java OOPS Mastery", 40, "Udemy", true, 4999, 20);

		course.displayDetails();
	}
}
