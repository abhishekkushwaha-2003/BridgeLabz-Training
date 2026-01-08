package com.loanbuddy;

//AutoLoan class extending LoanApplication
//Represents car/vehicle loan rules
public class AutoLoan extends LoanApplication {

 // Constructor for Auto Loan
 // Interest rate fixed for auto loans
 public AutoLoan(Applicant applicant, int term) {
     super(applicant, term, 10.0);
 }

 // Eligibility criteria specific to Auto Loan
 @Override
 protected boolean checkEligibility() {

     // Slightly lower credit score allowed
     return applicant.getCreditScore() >= 650;
 }

 // EMI calculation for Auto Loan
 @Override
 public double calculateEMI() {

     // Base EMI + additional processing charge
     return calculateBaseEMI() * 1.02;
 }
}

