package com.edumentor;

//main class
public class EduMentorMain {

	    public static void main(String[] args) {

	        // Create users
	        Learner learner = new Learner("Abhishek", "abhi@gmail.com", 101);
	        Instructor instructor = new Instructor("Kartik", "kartik@gmail.com", 201);

	        learner.displayUser();
	        instructor.displayUser();

	        // Create quiz
	        String[] questions = {
	            "Java is OOP?",
	            "Java supports multiple inheritance using class?",
	            "JVM is platform dependent?"
	        };

	        // 1 = true, 0 = false

	        int[] correctAnswers = {1, 0, 0}; 
	        Quiz quiz = new Quiz(questions, correctAnswers, "Medium");

	        // Learner submits answers
	        int[] userAnswers = {1, 1, 0};
	        quiz.submitAnswers(userAnswers);

	        // Attempt quiz
	        learner.attemptQuiz(quiz);

	        // Polymorphism demo
	        ICertifiable course1 = new ShortCourse();
	        ICertifiable course2 = new FullTimeCourse();

	        course1.generateCertificate();
	        course2.generateCertificate();
	    }
	}