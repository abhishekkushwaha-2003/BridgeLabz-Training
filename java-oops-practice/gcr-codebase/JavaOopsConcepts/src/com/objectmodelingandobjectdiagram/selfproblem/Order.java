package com.objectmodelingandobjectdiagram.selfproblem;

import java.util.ArrayList;

public class Order {

    // order id
    int orderId;

    // list of products (aggregation)
    ArrayList<Product> products = new ArrayList<>();

    // constructor
    Order(int orderId) {
        this.orderId = orderId;
    }

    // method to add product to order
    void addProduct(Product product) {
        products.add(product);
    }

    // method to calculate total bill
    double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.price;
        }
        return total;
    }

    // method to show order details
    void showOrder() {
        System.out.println("Order ID: " + orderId);
        for (Product p : products) {
            System.out.println("- " + p.productName + " : ₹" + p.price);
        }
        System.out.println("Total Amount: ₹" + calculateTotal());
    }
}

