package com.objectmodelingandobjectdiagram.selfproblem;

public class Customer {

    // customer name
    String customerName;

    // constructor
    Customer(String customerName) {
        this.customerName = customerName;
    }

    // method to place order (communication)
    void placeOrder(Order order) {
        System.out.println(customerName + " has placed an order.");
        order.showOrder();
    }
}
