// Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result


import java.util.Scanner;

// Create a class MultiplicationTableSixToNine to print the table from 6 to 9

public class MultiplicationTableSixToNine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking number input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Array to store results
        int[] result = new int[4];

        // Store multiplication from 6 to 9
        for (int i = 6; i <= 9; i++) {
            result[i - 6] = number * i;
        }

        // Display output
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + result[i - 6]);
        }

        sc.close();
    }
}
