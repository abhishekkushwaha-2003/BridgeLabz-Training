package com.ExceptionHandling.FinallyBlockExecution;

import java.util.Scanner;

class FinallyBlock{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Take input from user
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            // Perform division
            int result = num1 / num2;

            System.out.println("Result: " + result);
        }
        // Handles division by zero
        catch (ArithmeticException e) {
            System.out.println("(Exception Handled) Cannot divide by zero");
        }
        // This block always executes
        finally {
            System.out.println("Operation completed");
            sc.close();
        }
    }
}
