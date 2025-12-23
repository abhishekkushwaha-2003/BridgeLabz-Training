// Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method


// Create a class CompareStrings to compare two strings 

import java.util.Scanner;
public class CompareStrings{
	public static void main(String [] args){
	
	// Taking input from user
	
	Scanner sc = new Scanner (System.in);
	
	System.out.print("Enter first String :  ");
	
	// input of first string
	
	String firstString = sc.next();
	
	System.out.print("Enter second String :  ");
	
	// input of second string
	
	String secondString = sc.next();
	
	stringComparison(firstString, secondString);
	
	
	}
	
	public static void stringComparison (String firstString, String secondString){
	
			boolean ans = firstString.equals(secondString);
	
			// displaying result
	
			System.out.print(ans);
		
	}
}