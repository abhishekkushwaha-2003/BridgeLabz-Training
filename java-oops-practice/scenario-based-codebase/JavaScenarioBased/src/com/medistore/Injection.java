package com.medistore;

import java.time.LocalDate;
//Injection class extending Medicine

public class Injection extends Medicine {

 public Injection(String name, double price, LocalDate expiryDate, int quantity) {
     super(name, price, expiryDate, quantity);
 }

 // Expiry logic for injection
 @Override
 public boolean checkExpiry() {

     // Injection considered expired 10 days before expiry date
     return LocalDate.now().isAfter(expiryDate.minusDays(10));
 }
}
