package com.FunctionalInterfaces.DefaultMethodsInterfaces.PaymentGatewayIntegration;

public class PaymentGateway {
    public static void main(String[] args) {

        PaymentProcessor p1 = new UpiProcessor();
        PaymentProcessor p2 = new CardProcessor();

        p1.refund(500);
        p2.refund(1000);
    }
}

