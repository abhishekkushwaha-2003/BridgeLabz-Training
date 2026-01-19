package com.collection.ScenarioBased.ImplementBankingSystem;

class BankingApp {

    public static void main(String[] args) {

        BankingSystem bank = new BankingSystem();

        // Add customer accounts
        bank.addAccount(101, 5000);
        bank.addAccount(102, 12000);
        bank.addAccount(103, 8000);

        // Add withdrawal requests
        bank.requestWithdrawal(101, 2000);
        bank.requestWithdrawal(103, 9000);
        bank.requestWithdrawal(102, 3000);

        // Process all withdrawals
        bank.processWithdrawals();

        // Display accounts sorted by balance
        bank.showSortedAccounts();
    }
}
