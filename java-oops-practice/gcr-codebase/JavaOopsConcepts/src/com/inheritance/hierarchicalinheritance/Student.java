package com.inheritance.hierarchicalinheritance;

public class Student extends Person {
	private String grade;

	public Student(String name, int age, String grade) {
		super(name, age);
		this.grade = grade;
	}

	public void displayRole() {
		System.out.println("Role: Student");
		displayBasicInfo();
		System.out.println("Grade: " + grade);
		System.out.println("---------------------------");
	}
}
