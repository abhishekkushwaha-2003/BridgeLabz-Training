package com.LambdaExpression.MethodReferences;

import java.util.*;
import java.util.stream.Collectors;

class Invoice {
    int transactionId;

    Invoice(int transactionId) {
        this.transactionId = transactionId;
    }

    public String toString() {
        return "Invoice ID: " + transactionId;
    }
}

public class InvoiceObjectCreation {
    public static void main(String[] args) {

        List<Integer> transactionIds = Arrays.asList(5001, 5002, 5003);

        List<Invoice> invoices = transactionIds.stream()
                .map(Invoice::new)
                .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}
