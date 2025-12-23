// Write a Java program to count the number of vowels and consonants in a given string

// create a class CountVowelsAndConsonants 

import java.util.Scanner;

public class CountVowelsAndConsonants{
	public static void main(String [] args){
	
	// Taking input
	
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter a String : ");
	String str = sc.next();
	
	// defining variables to store count of vowels and consonants
	int vowels = 0;
	int consonants = 0;
	
	
	// for loop for traversal in string
	for(int i=0; i<str.length(); i++){
		char ch = str.charAt(i);
	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'  || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
	
	// if string contains vowels then its value increase
	vowels++;
	
	} else {
	
	// if string contains consonants then its value increase
	
	consonants++;
	
	}
	
	}
	
	// Displaying the result
	 System.out.println("Total Vowels : "+ vowels);
	 System.out.println("Total Consonants : "+ consonants);
	
	}
}