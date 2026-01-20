package com.ExceptionHandling.MultipleCatchBlocks;

import java.util.Scanner;

class MultipleCatch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array declared (try changing it to null to test NullPointerException)
        int[] arr = {10, 20, 30, 40, 50};

        try {
            // Take index from user
            System.out.print("Enter index: ");
            int index = sc.nextInt();

            // Access array element
            int value = arr[index];

            // Print value if everything is correct
            System.out.println("Value at index " + index + ": " + value);
        }
        // Handles invalid index
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        }
        // Handles null array access
        catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }

        sc.close();
    }
}
