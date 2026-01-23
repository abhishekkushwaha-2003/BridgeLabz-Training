package com.day10.BinarySearchTree.ECommerceProductInventory;

public class ECommerceApp {

    public static void main(String[] args) {

        ProductBST inventory = new ProductBST();

        // Add products
        inventory.insert(new Product(1005, "Laptop", 65000));
        inventory.insert(new Product(1001, "Mouse", 500));
        inventory.insert(new Product(1010, "Keyboard", 1200));
        inventory.insert(new Product(1003, "Monitor", 15000));

        // Lookup product
        Product p = inventory.search(1003);
        if (p != null) {
            System.out.println("Product Found → " + p.name + ", Price: ₹" + p.price);
        }

        //  Update price
        inventory.updatePrice(1001, 550);

        // Display sorted product list
        inventory.displaySorted();
    }
}
