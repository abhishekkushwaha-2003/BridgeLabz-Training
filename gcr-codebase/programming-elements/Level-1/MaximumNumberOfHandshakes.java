// create a class  MaximumNumberOfHandshakes to find the  maximum number of handshakes

import java.util.Scanner;
public class MaximumNumberOfHandshakes{
	public static void main (String [] args){
	
		Scanner sc = new Scanner (System.in);
	
		// Taking user input using Scanner object
	
		System.out.print("Enter Number Of Students : ");
	
		int numberOfStudents = sc.nextInt();
	
		int numberOfHandshakes =  ((numberOfStudents * (numberOfStudents - 1)) / 2);
	
		System.out.print("The number of possible handshakes is : "+ numberOfHandshakes );
	
	}

}