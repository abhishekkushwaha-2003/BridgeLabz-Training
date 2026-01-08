package com.loanbuddy;

//Implements IApprovable interface
public abstract class LoanApplication implements IApprovable {

 // Applicant who applied for the loan
 protected Applicant applicant;

 // Loan term in months
 protected int term;

 // Annual interest rate
 protected double interestRate;

 // Loan approval status (cannot be changed outside)
 private boolean approved;

 // Constructor to initialize common loan details
 public LoanApplication(Applicant applicant, int term, double interestRate) {
     this.applicant = applicant;
     this.term = term;
     this.interestRate = interestRate;
 }

 // Abstract method for eligibility check
 // Implemented differently by each loan type
 protected abstract boolean checkEligibility();

 // Method to approve or reject loan
 // Approval logic is hidden inside the class
 @Override
 public boolean approveLoan() {
     approved = checkEligibility();
     return approved;
 }

 // Common EMI calculation logic
 // Formula: P × R × (1+R)^N / ((1+R)^N – 1)
 protected double calculateBaseEMI() {

     // Principal loan amount
     double P = applicant.getLoanAmount();

     // Monthly interest rate
     double R = interestRate / (12 * 100);

     // Number of months
     int N = term;

     // EMI formula calculation
     return (P * R * Math.pow(1 + R, N)) /
            (Math.pow(1 + R, N) - 1);
 }

 // Getter for approval status
 // No setter provided to restrict external modification
 public boolean isApproved() {
     return approved;
 }
}

