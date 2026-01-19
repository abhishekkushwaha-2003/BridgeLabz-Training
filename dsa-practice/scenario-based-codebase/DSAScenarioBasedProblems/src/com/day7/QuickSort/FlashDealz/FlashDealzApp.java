package com.day7.QuickSort.FlashDealz;

//Main class 
public class FlashDealzApp {

 public static void main(String[] args) {

     // Large unsorted product list (sample data)
     Product[] products = {
         new Product(101, "Smartphone", 40),
         new Product(102, "Laptop", 25),
         new Product(103, "Headphones", 60),
         new Product(104, "Smartwatch", 35),
         new Product(105, "Camera", 50)
     };

     System.out.println("Before Sorting (Unsorted Discounts):");
     FlashDealzClass.displayProducts(products);

     // Quick Sort by discount
     FlashDealzClass.quickSort(products, 0, products.length - 1);

     System.out.println("\nAfter Sorting (Top Discounts First):");
     FlashDealzClass.displayProducts(products);
 }
}
