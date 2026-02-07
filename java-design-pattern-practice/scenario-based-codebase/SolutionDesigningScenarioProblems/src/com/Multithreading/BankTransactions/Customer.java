package com.Multithreading.BankTransactions;
class Customer extends Thread {

    private final Bank bank;
    private final int accountNumber;

    public Customer(String name, Bank bank, int accountNumber) {
        super(name);
        this.bank = bank;
        this.accountNumber = accountNumber;
    }

    @Override
    public void run() {

        try {
            bank.deposit(accountNumber, 5000);
            Thread.sleep(100);

            bank.withdraw(accountNumber, 8000);
            Thread.sleep(100);

            bank.withdraw(accountNumber, 4000);
            Thread.sleep(100);

            bank.deposit(accountNumber, 1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
