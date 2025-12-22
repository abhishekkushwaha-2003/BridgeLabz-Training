// Write a program to take 2 numbers and print their quotient and remainder

import java.util.Scanner;

// Create a class QuotientAndRemainder to find Quotient And Remainder of two numbers

public class QuotientAndRemainder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Takind  user input
        System.out.print("Enter number : ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter second number : ");
        int secondNumber = sc.nextInt();

        //  method calling 
		
        int[] arr = findRemainderAndQuotient(firstNumber, secondNumber);

        // Displaying the  result
        System.out.println("Quotient is : " + arr[0]+" And Remainder is : "+ arr[1]);

        sc.close();
    }

    // Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int firstNumber, int secondNumber) {

		// calculation of quotient and remainder
		
        int quotient = firstNumber / secondNumber;
        int remainder = firstNumber % secondNumber;

        return new int[]{quotient, remainder};
    }
}
