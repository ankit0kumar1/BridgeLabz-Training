package com.edumeter;

public class Quiz {
	private String[] questions;
	private final int[] correctAnswers;
	private int score;

	public Quiz(String difficulty) {
		if (difficulty.equalsIgnoreCase("easy")) {
			questions = new String[] { "Java is OOP?", "Java supports inheritance?" };
			correctAnswers = new int[] { 1, 1 }; // 1 = true
		} else {
			questions = new String[] { "JVM is platform dependent?", "Java supports multiple inheritance?" };
			correctAnswers = new int[] { 0, 0 }; // 0 = false
		}
	}

	// to attempt quiz
	public void attemptQuiz(int[] userAnswers) {
		for (int i = 0; i < correctAnswers.length; i++) {
			// Operator usage for scoring
			score += (userAnswers[i] == correctAnswers[i]) ? 1 : 0;
		}
	}

	public double getPercentage() {
		return ((double) score / correctAnswers.length) * 100;
	}

}