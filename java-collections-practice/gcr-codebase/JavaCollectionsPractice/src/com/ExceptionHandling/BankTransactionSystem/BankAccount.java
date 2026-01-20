package com.ExceptionHandling.BankTransactionSystem;

//Bank account class
class BankAccount {

 private double balance;

 BankAccount(double balance) {
     this.balance = balance;
 }

 // Withdraw method
 void withdraw(double amount) throws InsufficientBalanceException {

     // Check for negative amount
     if (amount < 0) {
         throw new IllegalArgumentException("Invalid amount!");
     }

     // Check for insufficient balance
     if (amount > balance) {
         throw new InsufficientBalanceException("Insufficient balance!");
     }

     // Deduct amount
     balance = balance - amount;

     System.out.println("Withdrawal successful, new balance: " + balance);
 }
}

