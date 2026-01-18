package com.JavaGenerics.SmartWarehouseManagementSystem;

//Common parent class for all warehouse items
abstract class WarehouseItem {

 private String name;

 // Constructor
 public WarehouseItem(String name) {
     this.name = name;
 }

 // Getter
 public String getName() {
     return name;
 }

 // Abstract method
 public abstract String getCategory();
}
