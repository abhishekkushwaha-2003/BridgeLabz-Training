package com.day6.BubbleSort.IceCreamRush;

// create a class IceCreamFlavour
public class IceCreamFlavor {

 String flavorName;   // Name of the ice cream flavor
 int soldCount;       // Number of times this flavor was sold

 // Constructor to initialize flavor details
 public IceCreamFlavor(String flavorName, int soldCount) {
     this.flavorName = flavorName;
     this.soldCount = soldCount;
 }

 // Display flavor details
 public void display() {
     System.out.println("Flavor: " + flavorName + ", Sold: " + soldCount + " times");
 }
}
