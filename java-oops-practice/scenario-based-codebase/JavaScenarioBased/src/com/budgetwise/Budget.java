package com.budgetwise;

import java.util.ArrayList;

//Base Budget class
public class Budget {

 protected double income;
 protected double limit;
 protected String[] categoryLimits;
 protected ArrayList<Transaction> transactions;

 // Constructor
 public Budget(double income, double limit, String[] categoryLimits) {
     this.income = income;
     this.limit = limit;
     this.categoryLimits = categoryLimits;
     this.transactions = new ArrayList<>();
 }

 // Encapsulation: no direct editing of expenses
 public void addTransaction(Transaction t) {
     transactions.add(t);
 }

 // Operator usage
 public double getTotalExpenses() {
     double total = 0;
     for (Transaction t : transactions) {
         if (t.getType().equals("EXPENSE")) {
             total += t.getAmount();
         }
     }
     return total;
 }

 public double getNetSavings() {
     return income - getTotalExpenses();
 }
}
