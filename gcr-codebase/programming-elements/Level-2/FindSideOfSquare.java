// Create a class FindSideOfSquare find the side of the square

import java.util.Scanner;
public class FindSideOfSquare{
	public static void main(String [] args){
			
			// Creating Scanner object to take input from user
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter perimeter : ");
			
			// Assigning values 
			
			double perimeter = sc.nextDouble();
			
			double side = perimeter / 4;
			
			System.out.print("The length of the side is "+ side +" whose perimeter is "+ perimeter);
			
		    sc.close();
			
		
		}
	}