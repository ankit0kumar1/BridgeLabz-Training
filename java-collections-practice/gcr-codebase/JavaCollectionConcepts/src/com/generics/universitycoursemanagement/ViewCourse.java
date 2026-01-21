package com.universitycoursemanagement;

import java.util.List;

public class ViewCourse {
	public static void displayCourses(List<? extends CourseType> courseTypes) {
		
		for (CourseType type : courseTypes) {
			System.out.println("Evalutation Type : " + type.getEvaluationType());
			type.evaluate();
		}
	}
}
