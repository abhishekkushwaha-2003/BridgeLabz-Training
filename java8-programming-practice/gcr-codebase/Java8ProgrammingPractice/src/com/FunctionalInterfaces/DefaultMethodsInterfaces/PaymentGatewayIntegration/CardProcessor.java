package com.FunctionalInterfaces.DefaultMethodsInterfaces.PaymentGatewayIntegration;

public class CardProcessor implements PaymentProcessor {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via Credit Card");
    }

    @Override
    public boolean refund(double amount) {
        System.out.println("Card refund processed: " + amount);
        return true;
    }
}
