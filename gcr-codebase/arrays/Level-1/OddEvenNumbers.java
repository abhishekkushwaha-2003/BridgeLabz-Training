// Create a program to save odd and even numbers into odd and even arrays between 1 to the number entered by the user.
// Finally, print the odd and even numbers array


import java.util.Scanner;

// create a class OddEvenNumbers to print the odd and even numbers 

public class OddEvenNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

			// Checking for natural number
			if (number <= 0) {
				System.out.println("Invalid input");
				return;
			}

			// Create arrays for even and oddd numbers
			int[] even = new int[number / 2 + 1];
			int[] odd = new int[number / 2 + 1];

			int evenIndex = 0, oddIndex = 0;

			// Separate odd and even numbers
			for (int i = 1; i <= number; i++) {
				if (i % 2 == 0)
					even[evenIndex++] = i;
				else
					odd[oddIndex++] = i;
			}

			// Print odd numbers
			System.out.println("Odd Numbers:");
			for (int i = 0; i < oddIndex; i++)
				System.out.print(odd[i] + " ");

			// Print even numbers
			System.out.println("\nEven Numbers:");
			for (int i = 0; i < evenIndex; i++)
				System.out.print(even[i] + " ");

			sc.close();
    }
}
