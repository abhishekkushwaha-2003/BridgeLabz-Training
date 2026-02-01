package com.Collectors.OrderRevenueSummary;

import java.util.*;
import java.util.stream.Collectors;

public class OrderRevenue {
    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
            new Order("Alice", 200),
            new Order("Bob", 150),
            new Order("Alice", 300)
        );

        Map<String, Double> revenue =
            orders.stream()
                .collect(Collectors.groupingBy(
                    Order::getCustomerName,
                    Collectors.summingDouble(Order::getAmount)
                ));

        System.out.println(revenue);
    }
}