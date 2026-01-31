package com.FunctionalInterfaces.ImplementingInterfaces.DigitalPaymentInterface;

public class PaymentInterface {
    public static void main(String[] args) {

        Payment p1 = new UPI();
        Payment p2 = new CreditCard();

        p1.pay(500);
        p2.pay(1200);
    }
}
