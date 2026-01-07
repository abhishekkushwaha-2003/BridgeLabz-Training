package com.linkedlist.singlylinkedlist.inventorymanagementsystem;

public class InventoryApp {

    public static void main(String[] args) {

        InventoryList inventory = new InventoryList();

        inventory.addAtEnd(101, "Pen", 50, 10);
        inventory.addAtEnd(102, "Notebook", 30, 50);
        inventory.addAtBeginning(103, "Pencil", 100, 5);

        inventory.displayItems();

        System.out.println("------------");

        inventory.updateQuantity(101, 70);
        inventory.searchItem(102, "");

        System.out.println("------------");

        inventory.calculateTotalValue();

        System.out.println("------------");

        inventory.sortByName();
        inventory.displayItems();

        System.out.println("------------");

        inventory.sortByPrice();
        inventory.displayItems();
    }
}

