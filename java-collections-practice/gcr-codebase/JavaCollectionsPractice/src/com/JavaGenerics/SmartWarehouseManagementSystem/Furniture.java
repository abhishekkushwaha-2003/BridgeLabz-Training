package com.JavaGenerics.SmartWarehouseManagementSystem;

//Furniture item
class Furniture extends WarehouseItem {

 public Furniture(String name) {
     super(name);
 }

 @Override
 public String getCategory() {
     return "Furniture";
 }
}
