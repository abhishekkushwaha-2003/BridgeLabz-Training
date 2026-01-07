package com.stackandqueue.sortstackusingrecursion;
import java.util.Stack;
public class StackMain {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // push elements
        stack.push(30);
        stack.push(10);
        stack.push(50);
        stack.push(20);

        System.out.println("Original Stack: " + stack);

        // sort stack
        SortStack.sortStack(stack);

        System.out.println("Sorted Stack: " + stack);
    }
}
