package com.day3.examproctor;

//ExamProctor.java
import java.util.HashMap;
import java.util.Stack;

//Core exam proctor system
public class ExamProctor {

 // Stack to track last visited questions
 private Stack<QuestionVisit> navigationStack = new Stack<>();

 // Map to store answers: questionId -> answer
 private HashMap<Integer, String> answerMap = new HashMap<>();

 // Map to store correct answers
 private HashMap<Integer, String> correctAnswers = new HashMap<>();

 // Constructor initializes correct answers
 public ExamProctor() {
     correctAnswers.put(1, "A");
     correctAnswers.put(2, "B");
     correctAnswers.put(3, "C");
     correctAnswers.put(4, "D");
 }

 // Visit a question
 public void visitQuestion(int questionId) {
     navigationStack.push(new QuestionVisit(questionId));
 }

 // Submit an answer
 public void submitAnswer(int questionId, String answer) {
     answerMap.put(questionId, answer);
 }

 // Evaluate exam score
 public int evaluateScore() {
     int score = 0;

     for (int qId : correctAnswers.keySet()) {
         if (answerMap.containsKey(qId) &&
             answerMap.get(qId).equals(correctAnswers.get(qId))) {
             score++;
         }
     }
     return score;
 }

 // Show navigation history
 public void showNavigationHistory() {
     System.out.print("Navigation Order: ");
     for (QuestionVisit q : navigationStack) {
         System.out.print(q.questionId + " ");
     }
     System.out.println();
 }
}
