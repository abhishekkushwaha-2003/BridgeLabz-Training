package com.LambdaExpression.BasicProblems;

import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    int discount;

    Product(String name, double price, double rating, int discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    public String toString() {
        return name + " Price:" + price + " Rating:" + rating + " Discount:" + discount;
    }
}

public class CustomSortingECommerce {
    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("Phone", 30000, 4.5, 20),
                new Product("Laptop", 60000, 4.7, 15),
                new Product("Headphones", 2000, 4.2, 30)
        );

        // Sort by price
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        System.out.println("Sorted by Price: " + products);

        // Sort by rating 
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        System.out.println("Sorted by Rating: " + products);

        // Sort by discount
        products.sort((p1, p2) -> p2.discount - p1.discount);
        System.out.println("Sorted by Discount: " + products);
    }
}
