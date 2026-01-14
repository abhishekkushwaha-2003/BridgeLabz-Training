package com.budgetwise;

//Annual budget implementation
public class AnnualBudget extends Budget implements IAnalyzable {

 public AnnualBudget(double income, double limit, String[] categories) {
     super(income, limit, categories);
 }

 // Polymorphism: Yearly report format
 @Override
 public void generateReport() {
     System.out.println("===== Annual Budget Summary =====");
     System.out.println("Total Income: " + income);
     System.out.println("Total Expenses: " + getTotalExpenses());
     System.out.println("Annual Savings: " + getNetSavings());
 }

 @Override
 public void detectOverspend() {
     if (getTotalExpenses() > limit) {
         System.out.println("Alert: Annual budget crossed!");
     } else {
         System.out.println("Annual budget is safe.");
     }
 }
}
