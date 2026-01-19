package com.day6.BubbleSort.IceCreamRush;

//Main class
public class IceCreamRushApp {

 public static void main(String[] args) {

     // Weekly sales data
     IceCreamFlavor[] flavors = {
         new IceCreamFlavor("Vanilla", 120),
         new IceCreamFlavor("Chocolate", 180),
         new IceCreamFlavor("Strawberry", 90),
         new IceCreamFlavor("Mango", 150),
         new IceCreamFlavor("Butterscotch", 110),
         new IceCreamFlavor("Pista", 70),
         new IceCreamFlavor("Black Currant", 95),
         new IceCreamFlavor("Coffee", 130)
     };

     // Before sorting
     System.out.println("Before Sorting (Weekly Sales):");
     IceCreamRushClass.displayFlavors(flavors);

     // Sort flavors by popularity
     IceCreamRushClass.bubbleSortByPopularity(flavors);

     // After sorting
     System.out.println("\nAfter Sorting by Popularity:");
     IceCreamRushClass.displayFlavors(flavors);
 }
}
