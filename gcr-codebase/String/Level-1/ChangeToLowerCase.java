// Write a program to convert the complete text to lowercase and compare the results



// Create a class ChangeToLowerCase to change the text to lower cace

import java.util.Scanner;

public class ChangeToLowerCase{
	public static void main (String [] args){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter a String : ");
	
	String string = sc.next();
	
	String stringUpper = string.toUpperCase();
	String toLowerCase = convertToLowerCase(string);
	
	boolean checkString = isStringSame(toLowerCase, stringUpper);
	
	System.out.println(checkString);
	
	System.out.print(stringUpper +" "+toLowerCase);
	
	
	
	}
	
	public static String convertToLowerCase(String string){
	
		String toLowerCase = "";
		for(int i=0 ; i<string.length(); i++){
			if(string.charAt(i) >= 'a' && string.charAt(i) <= 'z'){
			char ch = string.charAt(i);
			toLowerCase += (char)(ch - 32);
			
			} else {
			
			toLowerCase += string.charAt(i);
			
			}
			
		}
		return toLowerCase;
	
	}
	
	
	public static  boolean isStringSame(String toLowerCase, String stringUpper){
	
		if(toLowerCase.length() == stringUpper.length()){
			for(int i=0; i<toLowerCase.length(); i++){
			char ch1 = toLowerCase.charAt(i);
			char ch2 = stringUpper.charAt(i);
			
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