// create FindLargestNumber to find the largest number among three numbers

import java.util.Scanner;
public class FindLargestNumber{

	public static void main (String []args){

		// creating scanner object to take user input

		Scanner sc = new Scanner (System.in);

		System.out.print("Enter first number : ");

		int number1 = sc.nextInt();	

		System.out.print("Enter second number : ");

		int number2 = sc.nextInt();	

		System.out.print("Enter third number : ");

		int number3 = sc.nextInt();	

		// checking which number is greater

		if(number1 > number2 && number1 > number3){
		System.out.println("Is the first number the largest? Yes");
		System.out.println("Is the second number the largest? No");
		System.out.println("Is the third number the largest? No");

		} else if 

		(number2 > number1 && number2 > number3){
		System.out.println("Is the first number the largest? No");
		System.out.println("Is the second number the largest? Yes");
		System.out.println("Is the third number the largest? No");


		} else {

		System.out.println("Is the third number the largest? Yes");
		System.out.println("Is the first number the largest? No");
		System.out.println("Is the second number the largest? No");	

		}

		sc.close();
	
	}

}