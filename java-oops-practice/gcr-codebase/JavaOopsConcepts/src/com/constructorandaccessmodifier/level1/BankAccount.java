package com.constructorandaccessmodifier.level1;

//BankAccount class
//this class shows the use of access modifiers

public class BankAccount {

 // public variable - accessible everywhere
 public long accountNumber;

 // protected variable - accessible in same package and subclasses
 protected String accountHolder;

 // private variable - accessible only inside this class
 private double balance;

 // constructor to initialize account details
 BankAccount(long accountNumber, String accountHolder, double balance) {
     this.accountNumber = accountNumber;
     this.accountHolder = accountHolder;
     this.balance = balance;
 }

 // public method to get balance
 // used to access private variable
 public double getBalance() {
     return balance;
 }

 // public method to update balance
 // used to modify private variable
 public void setBalance(double balance) {
     this.balance = balance;
 }

 // method to display account details
 void displayAccount() {
     System.out.println("Account Number : " + accountNumber);
     System.out.println("Account Holder : " + accountHolder);
     System.out.println("Balance        : Rs. " + balance);
 }
}
