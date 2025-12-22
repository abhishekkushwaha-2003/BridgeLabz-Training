// Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors


import java.util.Scanner;

// Create a class FactorsOfNumber to find the factor of a number given by user

public class FactorsOfNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxSize = 10;
        int[] factors = new int[maxSize];
        int index = 0;

        // Find factors of number
        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {

                // Increase array size if full
                if (index == maxSize) {  
                    maxSize = maxSize * 2;
                    int[] temp = new int[maxSize];

                    for (int j = 0; j < factors.length; j++)
                        temp[j] = factors[j];

                    factors = temp;
                }

                factors[index++] = i;
            }
        }

        // Displaying factors
		
        System.out.println("Factors of the number:");
		
        for (int i = 0; i < index; i++)
            System.out.print(factors[i] + " ");

        sc.close();
    }
}
