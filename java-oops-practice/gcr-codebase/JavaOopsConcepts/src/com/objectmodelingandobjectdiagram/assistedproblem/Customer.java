package com.objectmodelingandobjectdiagram.assistedproblem;

public class Customer {

    // customer details
    String name;
    double balance;
    Bank bank;   // association with Bank

    // constructor
    Customer(String name, double balance, Bank bank) {
        this.name = name;
        this.balance = balance;
        this.bank = bank;
    }

    // method to view balance
    void viewBalance() {
        System.out.println("Customer Name: " + name);
        System.out.println("Bank: " + bank.bankName);
        System.out.println("Balance: ₹" + balance);
    }
}

