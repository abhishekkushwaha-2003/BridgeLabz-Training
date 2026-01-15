package com.payxpress;

import java.time.LocalDate;

//Main class to test PayXpress system
public class PayXpressApp {

 public static void main(String[] args) {

     Bill electricity = new ElectricityBill(1200, LocalDate.now().plusDays(5));
     Bill water = new WaterBill(500, LocalDate.now().plusDays(3));
     Bill internet = new InternetBill(999, LocalDate.now().plusDays(7));

     // Sending reminders (Polymorphism)
     electricity.sendReminder();
     water.sendReminder();
     internet.sendReminder();

     System.out.println();

     // Paying bills
     electricity.pay();
     water.pay();

     System.out.println();

     // Late fee calculation
     System.out.println("Internet bill late amount: " +
             internet.calculateLateFeeAmount());
 }
}
