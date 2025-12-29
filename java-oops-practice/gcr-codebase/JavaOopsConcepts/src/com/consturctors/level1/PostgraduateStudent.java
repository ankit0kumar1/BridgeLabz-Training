package com.consturctors.level1;

public class PostgraduateStudent extends Student{
	PostgraduateStudent(int rollnumber, String name , double cgpa ){
		super(rollnumber, name , cgpa);
	}
	public void displayDetails() {
		System.out.println("Roll Number: " + rollnumber);
		System.out.println("Student Name: " + name);
	    System.out.println("CGPA: " + getCgpa());  
	}
	
	public static void main(String [] args) {
		PostgraduateStudent s1 = new PostgraduateStudent(101,"Ankit", 8.5);
		s1.displayDetails();
		s1.setCgpa(9.5);
		System.out.println("----------------");
		s1.displayDetails();
	}

}
