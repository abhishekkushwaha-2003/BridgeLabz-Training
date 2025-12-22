//Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less


import java.util.Scanner;

// create a class IsNumberNegativePositiveZero to check the number is positive negative or zero

public class IsNumberNegativePositiveZero {
    public static void main(String[] args) {

        // Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Declare integer array of size 5
        int[] numbers = new int[5];

        // Taking input from user
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // For loop to check each number
        for (int i = 0; i < 5; i++) {

            // Check if number is positive
            if (numbers[i] > 0) {

                // Check even or odd
                if (numbers[i] % 2 == 0)
                    System.out.println(numbers[i] + " is Positive and Even");
                else
                    System.out.println(numbers[i] + " is Positive and Odd");
            }

            // Check if number is negative
            else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is Negative");
            }

            // If number is zero
            else {
                System.out.println(numbers[i] + " is Zero");
            }
        }

			// Compare first and last element of array
		
			if (numbers[0] == numbers[4]){
				System.out.println("First and Last elements are Equal");
				}
				
			else if (numbers[0] > numbers[4]){
				System.out.println("First element is Greater than Last");
				}
				
			else {
				System.out.println("First element is Less than Last");
				}

			sc.close();
    }
}
