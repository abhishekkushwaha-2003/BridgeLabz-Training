package com.loanbuddy;

//Main class to test LoanBuddy loan approval system
public class LoanBuddyApp {

 public static void main(String[] args) {

     // Creating an applicant with required details
     Applicant applicant = new Applicant(
             "Rohit Sharma",
             720,
             75000,
             500000
     );

     // Creating a Home Loan application
     LoanApplication loan = new HomeLoan(applicant, 240);

     // Approving loan and displaying result
     if (loan.approveLoan()) {

         // Loan approved case
         System.out.println("Loan Approved!");
         System.out.println("Monthly EMI: ₹" + loan.calculateEMI());

     } else {

         // Loan rejected case
         System.out.println("Loan Rejected!");
     }
 }
}
