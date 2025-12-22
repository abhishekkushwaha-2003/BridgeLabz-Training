// Create a program to take a number as input and reverse the number

import java.util.Scanner;

// Create a class ReverseTheNumber to reverse the number

public class ReverseTheNumber {
    public static void main(String[] args) {
	
	// Taking input from user

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
		
		// creating temp and count variable

        int temp = number;
        int count = 0;

        // Counting digits
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }
		
		// creating digits array of integer type

        int[] digits = new int[count];

        // Storing digits
        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number = number / 10;
        }

        // Printing reverse number
        System.out.print("Reversed Number = ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
    }
}
