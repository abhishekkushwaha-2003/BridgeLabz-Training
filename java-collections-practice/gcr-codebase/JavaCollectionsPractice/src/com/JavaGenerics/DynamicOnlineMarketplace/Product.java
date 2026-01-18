package com.JavaGenerics.DynamicOnlineMarketplace;

//create a class Product
class Product<T extends Category> {

 private String name;
 private double price;
 private T category;

 // Constructor
 public Product(String name, double price, T category) {
     this.name = name;
     this.price = price;
     this.category = category;
 }

 // Getters
 public String getName() {
     return name;
 }

 public double getPrice() {
     return price;
 }

 public T getCategory() {
     return category;
 }

 // Setter for price (used after discount)
 public void setPrice(double price) {
     this.price = price;
 }
}

