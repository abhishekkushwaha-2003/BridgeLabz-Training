package com.ExceptionHandling.BankTransactionSystem;

//Custom checked exception
class InsufficientBalanceException extends Exception {

 InsufficientBalanceException(String message) {
     super(message);
 }
}

