// Write a program to convert the complete text to uppercase and compare the results



// Create a class ChangeToUpperCase to change the text to upper case

import java.util.Scanner;

public class ChangeUpperCase{
	public static void main (String [] args){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter a String : ");
	
	String string = sc.nextLine();
	
	String stringLower = string.toUpperCase();
	String toUpperCase = convertToUpperCase(string);
	
	boolean checkString = isStringSame(toUpperCase, stringLower);
	
	System.out.println(checkString);
	
	System.out.print(stringLower +" "+toUpperCase);
	
	
	
	}
	
	public static String convertToUpperCase(String string){
	
		String toUpperCase = "";
		for(int i=0 ; i<string.length(); i++){
			if(string.charAt(i) >= 'a' && string.charAt(i) <= 'z'){
			char ch = string.charAt(i);
			toUpperCase += (char)(ch - 32);
			
			} else {
			
			toUpperCase += string.charAt(i);
			
			}
			
		}
		return toUpperCase;
	
	}
	
	
	public static  boolean isStringSame(String toUpperCase, String stringLower){
	
		if(toUpperCase.length() == stringLower.length()){
			for(int i=0; i<toUpperCase.length(); i++){
			char ch1 = toUpperCase.charAt(i);
			char ch2 = stringLower.charAt(i);
			
				if(ch1 != ch2){
					
					return false;
				}
				
			}
		
		} else {
			
			return false;
		}
	 
			return true;
	
	}
}