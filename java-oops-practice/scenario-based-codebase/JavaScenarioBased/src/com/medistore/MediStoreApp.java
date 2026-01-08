package com.medistore;

import java.time.LocalDate;

//Main class to test MediStore system
public class MediStoreApp {

 public static void main(String[] args) {

     // Creating medicine objects
     Medicine tablet = new Tablet(
             "Paracetamol",
             5.0,
             LocalDate.of(2026, 5, 20),
             20
     );

     Medicine syrup = new Syrup(
             "Cough Syrup",
             80.0,
             LocalDate.of(2025, 2, 10),
             10
     );

     Medicine injection = new Injection(
             "Insulin",
             150.0,
             LocalDate.of(2025, 1, 15),
             5
     );

     // Selling medicines
     tablet.sell(6);
     syrup.sell(2);
     injection.sell(1);

     // Display remaining stock
     System.out.println("\nRemaining Stock:");
     System.out.println("Tablet: " + tablet.getQuantity());
     System.out.println("Syrup: " + syrup.getQuantity());
     System.out.println("Injection: " + injection.getQuantity());
 }
}

