package com.universitydigitalrecord;

public class UniversityDigitalRecord {
	public static void main(String[] args) {
		StudentBST students = new StudentBST();
		students.insert(25, "Ankit Kumar");
		students.insert(13,"Amrit");
		students.insert(34,"Aryan");
		students.insert(75, "Vishal");
		students.insert(12, "Devashish");
		students.insert(14, "Akash");
		//display records in sorted order
		students.displayInOrder();
		
		System.out.println(students.search(26));
		students.delete(13);
		students.displayInOrder();
		
	}
}
