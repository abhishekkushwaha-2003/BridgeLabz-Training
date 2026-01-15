package com.payxpress;
import java.time.LocalDate;

//Electricity bill class
public class ElectricityBill extends Bill {

 public ElectricityBill(double amount, LocalDate dueDate) {
     super("Electricity", amount, dueDate);
 }

 // Polymorphism: custom reminder
 @Override
 public void sendReminder() {
     System.out.println("Electricity Bill Reminder: Avoid power disconnection!");
 }
}
