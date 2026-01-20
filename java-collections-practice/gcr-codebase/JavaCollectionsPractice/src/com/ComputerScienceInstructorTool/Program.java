package com.ComputerScienceInstructorTool;
import java.util.*;

public class Program {
	// create a  cleanseAndInvert method 
	public static String cleanseAndInvert(String input) {
		// checking for the character is alphabet or not
		boolean inval = false;
		for(char ch : input.toCharArray()) {
			if(!Character.isLetter(ch)) {
				inval = true;
				break;
			}
		}
		// checking for length is smaller than 6 or not
		if(input.length()<6 || inval) {
			return "";
		} 
		
		// converting String to lower case
		input = input.toLowerCase(); 
		
		// create a new empty String
		String newString = "";
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			// converting character to ASCII value
			if((int)ch % 2 != 0) {
				newString += ch;
			}
		}
		// create a new reverse string to reverse it
		String rev = "";
		
		for(int i = newString.length()-1; i >= 0; i--) {
			rev += newString.charAt(i);
		}
		
		// create a new result String to store the result
		String result = "";

		for(int i = 0; i < rev.length(); i++) {
			char ch = rev.charAt(i);
			// checking condition for Upper case character 
			if(i % 2 == 0) {
				result += Character.toUpperCase(ch);
			}
			else {
				result += ch;
			}
		}
		
		return result;
	}
	// main method
	public static void main(String [] args) {
		// Create Scanner object to take input from user 
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the word : ");
		String str = sc.nextLine();
		// calling cleanseAndInvert method
		String ans = cleanseAndInvert(str);
		// if length is 0 print invalid
		if(ans.length()==0) {
			System.out.println("Invalid Input");
		}
		else {
			System.out.println("Generated password is : "+ans);
		}
		
	}

}
