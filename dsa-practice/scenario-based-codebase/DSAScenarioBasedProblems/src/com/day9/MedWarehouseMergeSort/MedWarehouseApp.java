package com.day9.MedWarehouseMergeSort;

//Main class 
public class MedWarehouseApp {

 public static void main(String[] args) {

     // Combined data from multiple branches
     Medicine[] medicines = {
         new Medicine("Paracetamol", 12, 200),
         new Medicine("Cough Syrup", 20, 80),
         new Medicine("Antibiotic", 10, 50),
         new Medicine("Vitamin D", 25, 120),
         new Medicine("Pain Relief Gel", 20, 60)
     };

     System.out.println("Before Sorting:");
     MedWarehouse.displayMedicines(medicines);

     // Merge Sort by expiry date
     MedWarehouse.mergeSort(medicines, 0, medicines.length - 1);

     System.out.println("\nAfter Sorting by Expiry Date:");
     MedWarehouse.displayMedicines(medicines);

     // Alert medicines nearing expiry 
     MedWarehouse.alertNearExpiry(medicines, 15);
 }
}

