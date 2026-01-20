package com.universitycoursemanagement;

public class ResearchBasedCourse extends CourseType{
	public ResearchBasedCourse() {
        super("Research-Based");
    }

    @Override
    public void evaluate() {
        System.out.println("Evaluation through research work");
    }
}
