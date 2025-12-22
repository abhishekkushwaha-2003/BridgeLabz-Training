// Create a program to store the digits of the number in an array and find the largest and second largest element of the array.


import java.util.Scanner;

public class FindLargestDigits {
    public static void main(String[] args) {
	
	// taking input from user 

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = new int[10]; // fixed size array
        int index = 0;

        // Storing digits in array
        while (number != 0 && index < 10) {
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

		// variable initializing and assingning zero value

        int largest = 0;
        int secondLargest = 0;

        // Finding largest and second largest
        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest Digit = " + largest);
        System.out.println("Second Largest Digit = " + secondLargest);
    }
}
