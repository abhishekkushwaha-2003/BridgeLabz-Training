package com.Java8ConversionLogicalQuestions.ObjectCollectionConversions;

import java.util.*;
import java.util.stream.*;

public class OrderSumByCustomer {
    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
            new Order("Abhishek",200),
            new Order("Abhishek",300),
            new Order("Riya",150)
        );

        System.out.println(
            orders.stream()
                .collect(Collectors.groupingBy(
                    Order::getCustomer,
                    Collectors.summingDouble(Order::getAmount)
                ))
        );
    }
}
