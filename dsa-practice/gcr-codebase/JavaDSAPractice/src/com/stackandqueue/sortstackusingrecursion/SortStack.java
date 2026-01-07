package com.stackandqueue.sortstackusingrecursion;

import java.util.Stack;

class SortStack {

    // function to sort stack
    static void sortStack(Stack<Integer> stack) {

        // base condition
        if (!stack.isEmpty()) {

            // remove top element
            int temp = stack.pop();

            // sort remaining stack
            sortStack(stack);

            // insert element at correct position
            insertSorted(stack, temp);
        }
    }

    // function to insert element in sorted order
    static void insertSorted(Stack<Integer> stack, int element) {

        // base condition
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }

        // remove top element
        int temp = stack.pop();

        // recursive call
        insertSorted(stack, element);

        // put back the removed element
        stack.push(temp);
    }
}
