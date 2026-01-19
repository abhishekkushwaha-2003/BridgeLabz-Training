package com.collection.ScenarioBased.ImplementBankingSystem;

import java.util.HashMap;
import java.util.Map;

// This class stores customer accounts and balances
class AccountStore {

    private Map<Integer, Integer> accounts = new HashMap<>();

    // Add a new account
    void addAccount(int accountNumber, int balance) {
        accounts.put(accountNumber, balance);
    }

    // Get balance of an account
    int getBalance(int accountNumber) {
        return accounts.get(accountNumber);
    }

    // Update balance
    void updateBalance(int accountNumber, int newBalance) {
        accounts.put(accountNumber, newBalance);
    }

    // Return all accounts
    Map<Integer, Integer> getAllAccounts() {
        return accounts;
    }
}
