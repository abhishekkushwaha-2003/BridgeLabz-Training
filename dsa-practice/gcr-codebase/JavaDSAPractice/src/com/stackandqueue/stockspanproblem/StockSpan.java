package com.stackandqueue.stockspanproblem;

import java.util.Stack;

class StockSpan {

    // function to calculate stock span
    static int[] calculateSpan(int[] prices) {

        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        // first day span is always 1
        span[0] = 1;
        stack.push(0);

        // calculate span for rest of the days
        for (int i = 1; i < n; i++) {

            // pop while current price is higher or equal
            while (!stack.isEmpty() && prices[i] >= prices[stack.peek()]) {
                stack.pop();
            }

            // if stack is empty, span = i + 1
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            // push current index
            stack.push(i);
        }

        return span;
    }
}
