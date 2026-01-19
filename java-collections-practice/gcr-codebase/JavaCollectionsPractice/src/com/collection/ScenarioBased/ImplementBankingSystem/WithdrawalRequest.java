package com.collection.ScenarioBased.ImplementBankingSystem;

//This class represents a withdrawal request
class WithdrawalRequest {

 int accountNumber;
 int amount;

 WithdrawalRequest(int accountNumber, int amount) {
     this.accountNumber = accountNumber;
     this.amount = amount;
 }
}
