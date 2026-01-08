package com.medistore;

import java.time.LocalDate;
//Tablet class extending Medicine
public class Tablet extends Medicine {

 public Tablet(String name, double price, LocalDate expiryDate, int quantity) {
     super(name, price, expiryDate, quantity);
 }

 // Expiry logic for tablets
 @Override
 public boolean checkExpiry() {

     // Tablet considered expired only after expiry date
     return LocalDate.now().isAfter(expiryDate);
 }
}
