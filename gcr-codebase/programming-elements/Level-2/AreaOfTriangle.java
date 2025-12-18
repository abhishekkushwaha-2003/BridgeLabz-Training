// Create a class AreaOfTriangle to find the area of triangle in square inches and square centimeters 

import java.util.Scanner;
public class AreaOfTriangle{
	public static void main(String [] args){
			
			// Creating Scanner object to take user input
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter base : ");
			
			// Assigning values to base and height
			
			double base = sc.nextDouble();
			
			System.out.print("Enter height : ");
			
			double height = sc.nextDouble();
		        
			double areaOftriangleInCm = 0.5 * base * height;

			double areaOftriangleInInch = areaOftriangleInCm / (2.54 * 2.54);
			
			System.out.print("The Area of the triangle in sq inch is "+ areaOftriangleInInch +" and sq cm is " + areaOftriangleInCm);
			
		    sc.close();
		
		}
	}