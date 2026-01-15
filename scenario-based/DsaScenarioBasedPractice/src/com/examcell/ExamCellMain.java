package com.examcell;

public class ExamCellMain {
	public static void main(String[] args) {

		Student[] students = { 
				new Student(101, "Ankit", 92, "Delhi"),
				new Student(102, "Nitin", 88, "Mumbai"),
				new Student(103, "Karan", 95, "Delhi"),
				new Student(104, "Sneha", 88, "Chennai"),
				new Student(105, "Aman", 90, "Mumbai")
				};

		System.out.println("Before Ranking:");
		for (Student s : students) {
			s.display();
		}

		ExamCell.mergeSort(students, 0, students.length - 1);

		System.out.println("\nState-Level Rank List:");
		int rank = 1;
		for (Student s : students) {
			System.out.print("Rank " + rank++ + " → ");
			s.display();
		}
	}
}
