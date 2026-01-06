package com.edumentor;

//quiz class

public class Quiz {
	
	 private String[] questions;   // private = hidden
	    private int[] answers;        // private & cannot be modified
	    private int score;
	    private int[] userAnswers;

	    // Easy quiz constructor
	    public Quiz(String[] questions, int[] answers) {
	        this.questions = questions;
	        this.answers = answers;
	        this.userAnswers = new int[answers.length];
	    }

	    // Hard quiz constructor (difficulty parameter)
	    public Quiz(String[] questions, int[] answers, String difficulty) {
	        this.questions = questions;
	        this.answers = answers;
	        this.userAnswers = new int[answers.length];
	        System.out.println("Quiz Difficulty: " + difficulty);
	    }

	    // Simulate user answering
	    public void submitAnswers(int[] userAnswers) {
	        this.userAnswers = userAnswers;
	    }

	    // Evaluate score using operators
	    public void evaluate() {
	        score = 0;
	        for (int i = 0; i < answers.length; i++) {
	            if (userAnswers[i] == answers[i]) {
	                score = score + 1;  // using +
	            }
	        }
	        System.out.println("Score: " + score + "/" + answers.length);
	    }

	    public double getPercentage() {
	        return (score * 100.0) / answers.length;  // using *, /
	    }
}