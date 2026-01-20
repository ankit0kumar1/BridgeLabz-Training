package com.universitycoursemanagement;

public class AssignmentBasedCourse extends CourseType{

	public AssignmentBasedCourse() {
		super("Assignment-Based");
		
	}

	@Override
	public void evaluate() {
		System.out.println("Evalutation through assignments");
		
	}
	
}
