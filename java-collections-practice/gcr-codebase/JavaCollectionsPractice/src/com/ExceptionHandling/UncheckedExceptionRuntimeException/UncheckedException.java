package com.ExceptionHandling.UncheckedExceptionRuntimeException;

import java.util.InputMismatchException;
import java.util.Scanner;

class UncheckedException{

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
            System.out.println("Error: Division by zero is not allowed");
        }
        // Handles non-numeric input
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter only numeric values");
        }
        // Always executed
        finally {
            sc.close();
        }
    }
}
