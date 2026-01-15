package com.payxpress;

import java.time.LocalDate;

//Parent class for all utility bills
public class Bill implements IPayable {

 protected String type;
 protected double amount;
 protected LocalDate dueDate;

 private boolean isPaid;   // Encapsulation: cannot be changed directly
 protected double penalty; // late fee

 // Constructor for recurring bills
 public Bill(String type, double amount, LocalDate dueDate) {
     this.type = type;
     this.amount = amount;
     this.dueDate = dueDate;
     this.isPaid = false;
     this.penalty = 50; // default late fee
 }

 // Controlled payment method
 @Override
 public void pay() {
     if (!isPaid) {
         isPaid = true;
         System.out.println(type + " bill paid successfully");
     } else {
         System.out.println(type + " bill already paid");
     }
 }

 // Operator usage: base amount + penalty
 public double calculateLateFeeAmount() {
     return amount + penalty;
 }

 // Read-only status check
 public boolean isBillPaid() {
     return isPaid;
 }

 // Default reminder (will be overridden)
 @Override
 public void sendReminder() {
     System.out.println("Reminder: Please pay your " + type + " bill");
 }
}
