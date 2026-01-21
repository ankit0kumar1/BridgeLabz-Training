package com.universitycoursemanagement;

public class ExamBasedCourse extends CourseType{

	public ExamBasedCourse() {
		super("Exam-based");
	}

	@Override
	public void evaluate() {
		System.out.println("Evalutation through written exams.");
		
	}
	
	
}
