package com.budgetwise;

//Main class to test BudgetWise
public class BudgetWiseApp {

 public static void main(String[] args) {

     String[] categories = {"Food", "Rent", "Travel"};

     MonthlyBudget monthly = new MonthlyBudget(50000, 40000, categories);
     AnnualBudget annual = new AnnualBudget(600000, 480000, categories);

     // Adding transactions
     monthly.addTransaction(new Transaction(12000, "EXPENSE", "Rent"));
     monthly.addTransaction(new Transaction(6000, "EXPENSE", "Food"));

     annual.addTransaction(new Transaction(150000, "EXPENSE", "Rent"));
     annual.addTransaction(new Transaction(80000, "EXPENSE", "Travel"));

     // Polymorphism in action
     monthly.generateReport();
     monthly.detectOverspend();

     System.out.println();

     annual.generateReport();
     annual.detectOverspend();
 }
}
