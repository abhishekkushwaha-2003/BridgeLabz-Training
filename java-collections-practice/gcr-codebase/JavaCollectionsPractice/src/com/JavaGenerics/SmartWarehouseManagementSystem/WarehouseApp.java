package com.JavaGenerics.SmartWarehouseManagementSystem;
class WarehouseApp {
	// main method
    public static void main(String[] args) {

        // Electronics storage
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Mobile"));

        // Grocery storage
        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("Rice"));
        groceryStorage.addItem(new Groceries("Sugar"));

        // Furniture storage
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Table"));

        // Display all items using wildcard method
        System.out.println("---- Electronics ----");
        WarehouseUtil.displayItems(electronicsStorage.getItems());

        System.out.println("---- Groceries ----");
        WarehouseUtil.displayItems(groceryStorage.getItems());

        System.out.println("---- Furniture ----");
        WarehouseUtil.displayItems(furnitureStorage.getItems());
    }
}
