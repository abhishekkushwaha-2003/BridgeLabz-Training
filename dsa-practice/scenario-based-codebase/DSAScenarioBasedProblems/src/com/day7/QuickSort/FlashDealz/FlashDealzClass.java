package com.day7.QuickSort.FlashDealz;
//Contains Quick Sort logic for FlashDealz
public class FlashDealzClass {

 // Quick Sort method
 public static void quickSort(Product[] products, int low, int high) {

     // Base condition
     if (low < high) {

         // Get pivot position
         int pivotIndex = partition(products, low, high);

         // Sort left part
         quickSort(products, low, pivotIndex - 1);

         // Sort right part
         quickSort(products, pivotIndex + 1, high);
     }
 }

 // Partition method based on discount
 private static int partition(Product[] products, int low, int high) {

     // Choose last product's discount as pivot
     double pivot = products[high].getDiscount();
     int i = low - 1;

     // Compare each product with pivot
     for (int j = low; j < high; j++) {

         // Descending order (higher discount first)
         if (products[j].getDiscount() >= pivot) {
             i++;

             // Swap products[i] and products[j]
             Product temp = products[i];
             products[i] = products[j];
             products[j] = temp;
         }
     }

     // Place pivot at correct position
     Product temp = products[i + 1];
     products[i + 1] = products[high];
     products[high] = temp;

     return i + 1;
 }

 // Display all products
 public static void displayProducts(Product[] products) {
     for (Product p : products) {
         p.display();
     }
 }
}
