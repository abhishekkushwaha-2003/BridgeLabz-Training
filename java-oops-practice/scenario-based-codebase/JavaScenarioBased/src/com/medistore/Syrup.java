package com.medistore;

import java.time.LocalDate;
//Syrup class extending Medicine
//Liquid medicines expire faster
public class Syrup extends Medicine {

 public Syrup(String name, double price, LocalDate expiryDate, int quantity) {
     super(name, price, expiryDate, quantity);
 }

 // Expiry logic for syrup
 @Override
 public boolean checkExpiry() {

     // Syrup considered expired 5 days before expiry date
     return LocalDate.now().isAfter(expiryDate.minusDays(5));
 }
}
