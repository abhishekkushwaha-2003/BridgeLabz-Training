package com.Multithreading.BankTransactions;

import java.util.*;

class Bank {

    private final Map<Integer, Integer> accounts = new HashMap<>();

    public Bank(Map<Integer, Integer> initialAccounts) {
        accounts.putAll(initialAccounts);
    }

    public synchronized void deposit(int accountNumber, int amount) {
        int bal = accounts.getOrDefault(accountNumber, 0);
        bal += amount;
        accounts.put(accountNumber, bal);

        System.out.println(Thread.currentThread().getName() +
                " deposite " + amount +
                " | Account: " + accountNumber +
                " | New Balance: " + bal);
    }

    public synchronized void withdraw(int accountNumber, int amount) {
        int bal = accounts.getOrDefault(accountNumber, 0);

        if (bal >= amount) {
            bal -= amount;
            accounts.put(accountNumber, bal);

            System.out.println(Thread.currentThread().getName() +
                    " withdraw " + amount +
                    " | Account: " + accountNumber +
                    " | New Balance: " + bal);
        } else {
            System.out.println(Thread.currentThread().getName() +
                    " FAILED withdraw of " + amount +
                    " | Account: " + accountNumber +
                    " | Balance: " + bal);
        }
    }

    public synchronized int getBalance(int accountNumber) {
        return accounts.getOrDefault(accountNumber, 0);
    }
}
