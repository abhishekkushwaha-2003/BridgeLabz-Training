package com.day6.BubbleSort.IceCreamRush;

// create a class IceCreamRush
public class IceCreamRushClass {

 // Bubble Sort based on popularity (descending order)
 public static void bubbleSortByPopularity(IceCreamFlavor[] flavors) {

     int n = flavors.length; // Total number of flavors

     // Outer loop for number of passes
     for (int i = 0; i < n - 1; i++) {

         // Inner loop for adjacent comparison
         for (int j = 0; j < n - i - 1; j++) {

             // If current flavor is less popular than next flavor
             if (flavors[j].soldCount < flavors[j + 1].soldCount) {

                 // Swap the two flavors
                 IceCreamFlavor temp = flavors[j];
                 flavors[j] = flavors[j + 1];
                 flavors[j + 1] = temp;
             }
         }
     }
 }

 // Display all flavors
 public static void displayFlavors(IceCreamFlavor[] flavors) {
     for (IceCreamFlavor f : flavors) {
         f.display();
     }
 }
}
