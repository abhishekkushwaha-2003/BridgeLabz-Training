package com.ExceptionHandling.NestedTryCatchBlock;

import java.util.Scanner;

class NestedTryCatch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Sample array
        int[] arr = {10, 20, 30, 40};

        try {
            // Take index input
            System.out.print("Enter array index: ");
            int index = sc.nextInt();

            // Access array element
            int value = arr[index];

            try {
                // Take divisor input
                System.out.print("Enter divisor: ");
                int divisor = sc.nextInt();

                // Perform division
                int result = value / divisor;
                System.out.println("Result: " + result);
            }
            // Handles division by zero
            catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }

        }
        // Handles invalid array index
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }

        sc.close();
    }
}
