/* Write a program to find the sum of n natural numbers using recursive method and compare the result with the formulae n*(n+1)/2 and show the result from both computations is correct. 
*/


//create a class SumOfNaturalNumbers 
import java.util.Scanner;
public class SumOfNaturalNumbers {

    public static void main(String [] args) {

        //create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Checking whether the number is a natural number
        if (number <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
            return;
        }

        // Calling recursive method
        int recursiveResult = recursiveSum(number);

        //Calling formula method
        int formulaResult = formulaSum(number);

        // Displaying results
        System.out.println("Sum using recursion: " + recursiveResult);
        System.out.println("Sum using formula: " + formulaResult);

        // Comparing both results
        if (recursiveResult == formulaResult) {
            System.out.println("Both results are correct and equal.");
        } else {
            System.out.println("Results are not equal.");
        }
		
		sc.close();
    }

  // Recursive method to find sum of n natural numbers
    public static int recursiveSum(int number) {
		
		// If number = 0, sum is 0 (base condition)
        if (number == 0) {
            return 0;
        }
        return number + recursiveSum(number - 1);
    }

	// Method to find sum using formula n*(n+1)/2
	public static int formulaSum(int number) {
		return number * (number + 1) / 2;
	}
}
