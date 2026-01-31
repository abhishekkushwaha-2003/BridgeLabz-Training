package com.FunctionalInterfaces.DefaultMethodsInterfaces.PaymentGatewayIntegration;

public class UpiProcessor implements PaymentProcessor {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via UPI");
    }
}
