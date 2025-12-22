// Create a program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit


import java.util.Scanner;

// create a class FrequencyOfDigit to find the freaquency of digits in the number

public class FrequencyOfDigit {
    public static void main(String[] args) {
	
	// taking input from user

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

        int[] digits = new int[count];
        int[] freq = new int[10]; // frequency of digits 0–9

        // Storing digits in array
        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number = number / 10;
        }

        // Finding frequency of each digit
        for (int i = 0; i < count; i++) {
            freq[digits[i]]++;
        }

        // Displaying frequency
		
        System.out.println("\nDigit Frequency:");
		
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " times");
            }
        }
    }
}
