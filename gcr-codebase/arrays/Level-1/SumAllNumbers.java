//Write a program to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number

import java.util.Scanner;

//Create a class SumAllNumbers to print the sum of all numbers util user enters zero 

public class SumAllNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Size of array
        double[] values = new double[10];

        // Variable to store sum
        double total = 0.0;

        int index = 0;
		
		 System.out.print("Enter 10 number: ");
 
        // Infinite loop
        while (true) {
            double num = sc.nextDouble();

            // Checking condition for number is zero or array is full
            if (num <= 0 || index == 10)
                break;

            // Store value in array
            values[index] = num;
            index++;
        }

        // Calculating sum
        for (int i = 0; i < index; i++) {
            total = total + values[i];
        }

        // Displaying result
        System.out.println("Sum of numbers = " + total);

        sc.close();
    }
}
