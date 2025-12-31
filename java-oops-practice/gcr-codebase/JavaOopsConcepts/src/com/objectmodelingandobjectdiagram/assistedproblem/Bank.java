package com.objectmodelingandobjectdiagram.assistedproblem;

import java.util.ArrayList;

public class Bank {

    // bank name
    String bankName;

    // list of customers
    ArrayList<Customer> customers = new ArrayList<>();

    // constructor
    Bank(String bankName) {
        this.bankName = bankName;
    }

    // method to open account for customer
    void openAccount(Customer customer) {
        customers.add(customer);
        System.out.println("Account opened for " + customer.name +
                           " in " + bankName);
    }
}

