package com.edumentor;

//abstract learner class
public class Learner extends User {
	
	public Learner(String name, String emailId, int userId) {
		super(name, emailId, userId);
	}
	public void attemptQuiz(Quiz quiz) {
        quiz.evaluate();
        System.out.println("Percentage: " + quiz.getPercentage() + "%");
    }
}