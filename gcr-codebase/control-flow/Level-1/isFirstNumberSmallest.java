//Creating class with name isFirstNumberSmallest  to check first number is smallest or not 


import java.util.Scanner;

public class isFirstNumberSmallest{
	public static void main(String [] args){

		// Taking input

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number : ");		

		int number1 = sc.nextInt();

		System.out.print("Enter second number : ");	

		int number2 = sc.nextInt();

		System.out.print("Enter third number : ");	

		int number3 = sc.nextInt();

		// checking condition by comparing each number

		if(number1 < number2 && number1 < number3){
		System.out.print(" Is the first number the smallest? Yes ");

		} else {

		System.out.print(" Is the first number the smallest? No ");
	        
		}

		sc.close();

		}
}

