package com.edumeter;

public class EduMentorApp {
	 public static void main(String[] args) {

	     Learner learner = new Learner("Amit", "amit@gmail.com", 101, true);
	     Instructor instructor = new Instructor("Dr. Sharma", "sharma@gmail.com", 201);
	     instructor.createCourse();

	     Quiz quiz = new Quiz("easy");
	     int[] answers = {1, 1};
	     quiz.attemptQuiz(answers);

	     System.out.println("Quiz Percentage: " + quiz.getPercentage() + "%");

	     learner.generateCertificate();
	 }
	}
