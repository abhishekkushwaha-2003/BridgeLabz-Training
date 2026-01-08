package com.loanbuddy;

//HomeLoan class extending LoanApplication
//Represents home loan specific rules
public class HomeLoan extends LoanApplication {

 // Constructor for Home Loan
 // Interest rate fixed for home loans
 public HomeLoan(Applicant applicant, int term) {
     super(applicant, term, 8.5);
 }

 // Eligibility criteria specific to Home Loan
 @Override
 protected boolean checkEligibility() {

     // Higher credit score and income required
     return applicant.getCreditScore() >= 700 &&
            applicant.getIncome() >= 50000;
 }

 // EMI calculation for Home Loan
 @Override
 public double calculateEMI() {

     // Uses base EMI calculation
     return calculateBaseEMI();
 }
}
