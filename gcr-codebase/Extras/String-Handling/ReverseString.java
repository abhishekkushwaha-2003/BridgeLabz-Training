// Write a Java program to reverse a given string without using any built-in reverse functions

// create a class ReverseString

import java.util.Scanner;

public class ReverseString{
	public static void main(String [] args){
	
	// Taking input
	
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter a String : ");
	String str = sc.next();
	
	// Create a empty string
	
	String emptyString = "";
	
	// for loop for traversal in string
	for(int i=str.length()-1; i>=0; i--){
		emptyString += str.charAt(i);
	    
	
	}
	
	// Displaying the result
	 System.out.println(" The Reverse String of String "+str+" is : "+ emptyString);
	
	}
}