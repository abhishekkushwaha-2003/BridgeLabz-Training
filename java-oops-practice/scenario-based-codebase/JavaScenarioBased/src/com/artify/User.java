package com.artify;

//Class representing a user/buyer
public class User {

 // User name
 private String name;

 // Wallet balance (private for safety)
 private double walletBalance;

 // Constructor to initialize user
 public User(String name, double walletBalance) {
     this.name = name;
     this.walletBalance = walletBalance;
 }

 // Method to deduct balance after purchase
 public boolean deductBalance(double amount) {
     if (walletBalance >= amount) {
         walletBalance -= amount;
         return true;
     }
     System.out.println("Insufficient wallet balance");
     return false;
 }

 // Getter for wallet balance
 public double getWalletBalance() {
     return walletBalance;
 }
}
