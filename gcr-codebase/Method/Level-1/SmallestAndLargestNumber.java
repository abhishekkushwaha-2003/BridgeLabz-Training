// Write a program to find the smallest and the largest of the 3 numbers

import java.util.Scanner;

public class SmallestAndLargestNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter first number : ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number : ");
        int number2 = sc.nextInt();

        System.out.print("Enter third number : ");
        int number3 = sc.nextInt();

        // Calling method
        int [] arr  = findSmallestAndLargest(number1, number2, number3);
		
		// display result 
		
		 System.out.println("The smallest is "+arr[0]+" and largest is "+arr[1]+" of the three numbers "+number1+" "+number2+" "+number3);

        sc.close();
    }

    // create a findSmallestAndLargest method to find smallest and largest number
    public static int [] findSmallestAndLargest(int number1, int number2, int number3) {

        int smallest = number1;
        int largest = number1;
		
		// checking for smallest and largest number

        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }

        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }

	return new  int []{smallest, largest};
        
    }
}
