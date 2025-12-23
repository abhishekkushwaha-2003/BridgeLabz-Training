// Write a Java program to check if a given string is a palindrome

// Create a class IsPalindrome to check the string is palindrome or not

import java.util.Scanner;
public class IsPalindrome{
	public static void main (String [] args){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter a string : ");
	
	String str = sc.next();
	
	char [] arr = str.toCharArray();
    boolean check = true; 
	int j = arr.length-1;
	for(int i=0; i<arr.length; i++){
		if(arr[i] != arr[j]){
		  check = false;
		}
		
		j--;
	
	}
	
	System.out.print(check);

	}
}