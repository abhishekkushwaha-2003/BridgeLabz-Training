package com.linkedlist.singlylinkedlist.inventorymanagementsystem;

//node class for inventory item
class ItemNode {

 int itemId;
 String itemName;
 int quantity;
 double price;

 ItemNode next; // pointer to next node

 // constructor
 ItemNode(int itemId, String itemName, int quantity, double price) {
     this.itemId = itemId;
     this.itemName = itemName;
     this.quantity = quantity;
     this.price = price;
     this.next = null;
 }
}
