package com.stackandqueue.stockspanproblem;

public class StockMain {
    public static void main(String[] args) {

        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        int[] span = StockSpan.calculateSpan(prices);

        System.out.println("Stock Prices:");
        for (int price : prices) {
            System.out.print(price + " ");
        }

        System.out.println("\n\nStock Span:");
        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}

