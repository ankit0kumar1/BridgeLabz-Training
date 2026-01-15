package com.examproctor;

import java.util.HashMap;
import java.util.Stack;

class ExamProctor {

    // Stack to track question navigation
    private Stack<Integer> navigationStack = new Stack<>();

    // Stores student answers: questionId -> answer
    private HashMap<Integer, String> answersMap = new HashMap<>();

    // Stores correct answers: questionId -> correctAnswer
    private HashMap<Integer, String> correctAnswers = new HashMap<>();

    // Constructor to preload correct answers
    public ExamProctor() {
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "B");
        correctAnswers.put(3, "C");
        correctAnswers.put(4, "D");
    }

    // Visit a question
    public void visitQuestion(int questionId) {
        navigationStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }

    // Go back to previous question
    public int goBack() {
        if (navigationStack.isEmpty()) {
            System.out.println("No previous question.");
            return -1;
        }
        int lastQuestion = navigationStack.pop();
        System.out.println("Going back from Question: " + lastQuestion);
        return lastQuestion;
    }

    // Submit or update an answer
    public void submitAnswer(int questionId, String answer) {
        answersMap.put(questionId, answer);
        System.out.println("Answer saved for Question " + questionId);
    }

    // Calculate score
    public int calculateScore() {
        int score = 0;

        for (int qId : correctAnswers.keySet()) {
            if (answersMap.containsKey(qId)) {
                if (answersMap.get(qId).equals(correctAnswers.get(qId))) {
                    score++;
                }
            }
        }
        return score;
    }
}

