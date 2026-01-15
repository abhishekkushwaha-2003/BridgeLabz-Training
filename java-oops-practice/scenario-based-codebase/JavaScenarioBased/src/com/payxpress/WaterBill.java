package com.payxpress;
import java.time.LocalDate;
//Water bill class
public class WaterBill extends Bill {

 public WaterBill(double amount, LocalDate dueDate) {
     super("Water", amount, dueDate);
 }

 @Override
 public void sendReminder() {
     System.out.println("Water Bill Reminder: Keep your water supply active.");
 }
}

