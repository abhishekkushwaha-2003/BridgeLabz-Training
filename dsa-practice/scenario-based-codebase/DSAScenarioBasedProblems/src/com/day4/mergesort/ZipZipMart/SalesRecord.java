package com.day4.mergesort.ZipZipMart;

import java.time.LocalDate;

//Represents one sale transaction
public class SalesRecord {

 LocalDate date;
 double amount;
 String branch;

 public SalesRecord(LocalDate date, double amount, String branch) {
     this.date = date;
     this.amount = amount;
     this.branch = branch;
 }

 public void display() {
     System.out.println(date + " | ₹" + amount + " | " + branch);
 }
}
