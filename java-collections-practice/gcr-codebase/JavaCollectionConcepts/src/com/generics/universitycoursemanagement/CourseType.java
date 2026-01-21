package com.universitycoursemanagement;

public abstract class CourseType {
	private String evaluationType;
	
	public CourseType(String evalutationType) {
		this.evaluationType = evalutationType;
	}
	
	public String getEvaluationType() {
		return evaluationType;
	}
	
	public abstract void evaluate();
}
