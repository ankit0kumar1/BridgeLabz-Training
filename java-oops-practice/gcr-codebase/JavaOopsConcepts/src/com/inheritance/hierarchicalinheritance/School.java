package com.inheritance.hierarchicalinheritance;

public class School {
	public static void main(String[] args) {

		Teacher teacher = new Teacher("Mr. Sharma", 40, "Mathematics");
		Student student = new Student("Ankit", 20, "B.Tech");
		Staff staff = new Staff("Ramesh", 35, "Administration");

		teacher.displayRole();
		student.displayRole();
		staff.displayRole();
	}
}
