// Program to find the maximum number of handshakes among students.

// Create a class MaximumNumberOfHandshakes to  find the maximum number of handshakes among students.

import java.util.Scanner;
	public class MaximumNumberOfHandshakes{
		public static void main (String [] args){
	
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter Number Of Students : ");
	
		int numberOfStudents = sc.nextInt();
	
		numberOfHandshakes(numberOfStudents);
	
		sc.close();
	
		}   // Create a  method numberOfHandshakes to find the total number of handshakes
	
			public static void  numberOfHandshakes(int numberOfStudents){
	
			int totalHandshakes = (numberOfStudents * (numberOfStudents - 1) / 2);
	 
			System.out.print("The number of possible handshakes is : "+totalHandshakes);
	
	}
}
