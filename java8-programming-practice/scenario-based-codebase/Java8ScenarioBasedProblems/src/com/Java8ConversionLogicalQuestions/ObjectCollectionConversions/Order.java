package com.Java8ConversionLogicalQuestions.ObjectCollectionConversions;

public class Order {
    private String customer;
    private double amount;

    public Order(String customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }

    public String getCustomer() { return customer; }
    public double getAmount() { return amount; }
}
