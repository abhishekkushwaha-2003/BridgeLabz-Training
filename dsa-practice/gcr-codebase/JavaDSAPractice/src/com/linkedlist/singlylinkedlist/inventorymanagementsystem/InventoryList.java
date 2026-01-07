package com.linkedlist.singlylinkedlist.inventorymanagementsystem;

class InventoryList {

    private ItemNode head; // head of linked list

    // add item at beginning
    void addAtBeginning(int id, String name, int qty, double price) {

        ItemNode newNode = new ItemNode(id, name, qty, price);
        newNode.next = head;
        head = newNode;

        System.out.println("Item added at beginning");
    }

    // add item at end
    void addAtEnd(int id, String name, int qty, double price) {

        ItemNode newNode = new ItemNode(id, name, qty, price);

        if (head == null) {
            head = newNode;
            return;
        }

        ItemNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

        System.out.println("Item added at end");
    }

    // add item at specific position (1-based index)
    void addAtPosition(int pos, int id, String name, int qty, double price) {

        if (pos <= 1) {
            addAtBeginning(id, name, qty, price);
            return;
        }

        ItemNode newNode = new ItemNode(id, name, qty, price);
        ItemNode temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        System.out.println("Item added at position " + pos);
    }

    // remove item by item id
    void removeById(int id) {

        if (head == null) {
            System.out.println("Inventory is empty");
            return;
        }

        if (head.itemId == id) {
            head = head.next;
            System.out.println("Item removed");
            return;
        }

        ItemNode temp = head;
        while (temp.next != null && temp.next.itemId != id) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Item not found");
        } else {
            temp.next = temp.next.next;
            System.out.println("Item removed");
        }
    }

    // update quantity by item id
    void updateQuantity(int id, int newQty) {

        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                System.out.println("Quantity updated");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Item not found");
    }

    // search item by id or name
    void searchItem(int id, String name) {

        ItemNode temp = head;
        while (temp != null) {

            if (temp.itemId == id || temp.itemName.equalsIgnoreCase(name)) {
                System.out.println("Item Found:");
                System.out.println(temp.itemId + " " + temp.itemName +
                        " Qty:" + temp.quantity + " Price:" + temp.price);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Item not found");
    }

    // calculate total inventory value
    void calculateTotalValue() {

        double total = 0;
        ItemNode temp = head;

        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }

        System.out.println("Total Inventory Value = " + total);
    }

    // display all items
    void displayItems() {

        if (head == null) {
            System.out.println("Inventory empty");
            return;
        }

        ItemNode temp = head;
        while (temp != null) {
            System.out.println(temp.itemId + " " + temp.itemName +
                    " Qty:" + temp.quantity + " Price:" + temp.price);
            temp = temp.next;
        }
    }

    // sort by item name (ascending)
    void sortByName() {

        if (head == null) return;

        ItemNode i, j;
        for (i = head; i.next != null; i = i.next) {
            for (j = i.next; j != null; j = j.next) {

                if (i.itemName.compareToIgnoreCase(j.itemName) > 0) {
                    swapData(i, j);
                }
            }
        }

        System.out.println("Sorted by Item Name");
    }

    // sort by price (ascending)
    void sortByPrice() {

        ItemNode i, j;
        for (i = head; i.next != null; i = i.next) {
            for (j = i.next; j != null; j = j.next) {

                if (i.price > j.price) {
                    swapData(i, j);
                }
            }
        }

        System.out.println("Sorted by Price");
    }

    // helper method to swap node data
    private void swapData(ItemNode a, ItemNode b) {

        int id = a.itemId;
        String name = a.itemName;
        int qty = a.quantity;
        double price = a.price;

        a.itemId = b.itemId;
        a.itemName = b.itemName;
        a.quantity = b.quantity;
        a.price = b.price;

        b.itemId = id;
        b.itemName = name;
        b.quantity = qty;
        b.price = price;
    }
}
