package com.day8.FoodFestMergeSort;

//Main class
public class FoodFestApp {

 public static void main(String[] args) {

     // Combined sorted data from different zones
     Stall[] stalls = {
         new Stall("Burger Hub", 320),
         new Stall("Pizza Point", 280),
         new Stall("Taco Town", 350),
         new Stall("Pasta Place", 280),
         new Stall("Dessert Den", 200)
     };

     System.out.println("Before Master Sorting:");
     FoodFest.displayStalls(stalls);

     // Merge Sort by footfall
     FoodFest.mergeSort(stalls, 0, stalls.length - 1);

     System.out.println("\nAfter Sorting by Customer Footfall:");
     FoodFest.displayStalls(stalls);
 }
}
