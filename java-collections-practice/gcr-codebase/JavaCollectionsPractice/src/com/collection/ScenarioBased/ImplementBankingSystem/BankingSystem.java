package com.collection.ScenarioBased.ImplementBankingSystem;

//Main banking system class
class BankingSystem {

 private AccountStore store = new AccountStore();
 private WithdrawalQueueProcessor processor =
         new WithdrawalQueueProcessor(store);
 private BalanceSorter sorter = new BalanceSorter();

 // Add account
 void addAccount(int accountNumber, int balance) {
     store.addAccount(accountNumber, balance);
 }

 // Request withdrawal
 void requestWithdrawal(int accountNumber, int amount) {
     processor.addRequest(
             new WithdrawalRequest(accountNumber, amount)
     );
 }

 // Process withdrawals
 void processWithdrawals() {
     processor.processRequests();
 }

 // Show accounts sorted by balance
 void showSortedAccounts() {
     sorter.displaySortedByBalance(store.getAllAccounts());
 }
}
