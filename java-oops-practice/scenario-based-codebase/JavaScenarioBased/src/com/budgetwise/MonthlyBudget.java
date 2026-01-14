package com.budgetwise;

//Monthly budget implementation
public class MonthlyBudget extends Budget implements IAnalyzable {

 public MonthlyBudget(double income, double limit, String[] categories) {
     super(income, limit, categories);
 }

 // Polymorphism: Monthly report
 @Override
 public void generateReport() {
     System.out.println("----- Monthly Budget Report -----");
     System.out.println("Income: " + income);
     System.out.println("Expenses: " + getTotalExpenses());
     System.out.println("Savings: " + getNetSavings());
 }

 @Override
 public void detectOverspend() {
     if (getTotalExpenses() > limit) {
         System.out.println("Warning: Monthly budget exceeded!");
     } else {
         System.out.println("Monthly spending is under control.");
     }
 }
}
