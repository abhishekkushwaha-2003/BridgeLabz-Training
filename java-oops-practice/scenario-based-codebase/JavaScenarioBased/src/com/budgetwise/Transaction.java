package com.budgetwise;

import java.time.LocalDate;

//Represents a single income or expense entry
public class Transaction {

 private double amount;
 private String type;      // INCOME or EXPENSE
 private LocalDate date;
 private String category;

 // Constructor
 public Transaction(double amount, String type, String category) {
     this.amount = amount;
     this.type = type;
     this.category = category;
     this.date = LocalDate.now();
 }

 // Getters only (Encapsulation)
 public double getAmount() {
     return amount;
 }

 public String getType() {
     return type;
 }

 public String getCategory() {
     return category;
 }
}
