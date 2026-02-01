package com.StreamAPI.forEachMethod;

import java.util.*;

public class StockPriceLogger {
    public static void main(String[] args) {

        List<Double> stockPrices =
                Arrays.asList(120.5, 118.75, 121.3, 119.9);

        System.out.println("Live Stock Prices:");
        stockPrices.forEach(price ->
                System.out.println("Price: ₹" + price));
    }
}
