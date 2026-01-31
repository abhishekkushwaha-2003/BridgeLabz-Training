package com.FunctionalInterfaces.DefaultMethodsInterfaces.PaymentGatewayIntegration;

public interface PaymentProcessor {

    void pay(double amount);

    default boolean refund(double amount) {
        System.out.println("Default refund processed: " + amount);
        return true;
    }
}
