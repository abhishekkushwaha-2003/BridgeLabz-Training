package com.constructorandaccessmodifier.level1;

//SavingsAccount class
//this class extends BankAccount to show protected access

class SavingsAccount extends BankAccount {

 double interestRate;

 // constructor
 SavingsAccount(long accountNumber, String accountHolder,
                double balance, double interestRate) {

     super(accountNumber, accountHolder, balance);
     this.interestRate = interestRate;
 }

 // method to display savings account details
 void displaySavingsAccount() {

     // accessing public and protected members from parent class
     System.out.println("Account Number : " + accountNumber);
     System.out.println("Account Holder : " + accountHolder);
     System.out.println("Interest Rate  : " + interestRate + "%");
     System.out.println("Balance        : Rs. " + getBalance());
 }
}
