package com.objectmodeling.level1.schoolmanagement;

public class SchoolManagement {
	public static void main(String [] args) {
		
		
		School school = new School("DAV Public School.");
		
		Student s1 = new Student("Ankit", 101);
		Student s2 = new Student("Keshav",102);
		
		Course c1 = new Course("Java");
		Course c2 = new Course("Python");
		
		s1.addCourse(c1);
		s1.addCourse(c2);
		s2.addCourse(c2);
		
		school.addStudents(s1);
		school.addStudents(s2);
		
		school.showStudents();
		
		s1.showCourses();
		c1.showStudents();
	}	
}
