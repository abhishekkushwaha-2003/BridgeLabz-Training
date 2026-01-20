package com.ExceptionHandling.BankTransactionSystem;

class BankTransactionApp {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(5000);

        try {
            // Try different values to test
            account.withdraw(2000);
            
            // amount is more than balance
            account.withdraw(6000);
            
            // amount cannot be negative
            //account.withdraw(-500);
            

        }
        // Handle custom checked exception
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        // Handle invalid amount
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
