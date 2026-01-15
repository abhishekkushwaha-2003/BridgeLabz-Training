package com.payxpress;
import java.time.LocalDate;
//Internet bill class
public class InternetBill extends Bill {

 public InternetBill(double amount, LocalDate dueDate) {
     super("Internet", amount, dueDate);
 }

 @Override
 public void sendReminder() {
     System.out.println("Internet Bill Reminder: Avoid service interruption.");
 }
}
