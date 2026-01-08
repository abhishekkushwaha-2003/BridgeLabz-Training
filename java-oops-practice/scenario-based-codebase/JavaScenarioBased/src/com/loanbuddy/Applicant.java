package com.loanbuddy;

//This class represents a loan applicant
//Encapsulation is applied by keeping sensitive data private
public class Applicant {

 // Applicant name
 private String name;

 // Credit score is kept private 
 private int creditScore;

 // Monthly income of applicant
 private double income;

 // Loan amount requested by applicant
 private double loanAmount;

 // Constructor to initialize applicant details
 public Applicant(String name, int creditScore, double income, double loanAmount) {
     this.name = name;
     this.creditScore = creditScore;
     this.income = income;
     this.loanAmount = loanAmount;
 }

 // Getter for applicant name
 public String getName() {
     return name;
 }

 // Protected getter for credit score
 // Only loan-related classes can access it
 protected int getCreditScore() {
     return creditScore;
 }

 // Getter for income
 public double getIncome() {
     return income;
 }

 // Getter for loan amount
 public double getLoanAmount() {
     return loanAmount;
 }
}
