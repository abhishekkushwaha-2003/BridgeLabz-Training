package com.searching.stringbuilder;

// create a class RemoveDuplicates to  Remove Duplicates from a String Using StringBuilder
import java.util.HashSet;

class RemoveDuplicates {

 // Main method
 public static void main(String[] args) {

     // Creating the input string
     String input = "programming";

     // Creating StringBuilder to store result without duplicates
     StringBuilder result = new StringBuilder();

     // Creating HashSet 
     HashSet<Character> set = new HashSet<>();

     // Looping through each character of the string
     for (int i = 0; i < input.length(); i++) {

         // Getting current character from string
         char ch = input.charAt(i);

         // Checking if character is not already present in HashSet
         if (!set.contains(ch)) {

             // Adding character to StringBuilder
             result.append(ch);

             // Adding character to HashSet
             set.add(ch);
         }
     }

     // Printing the final string without duplicate characters
     System.out.println(result.toString());
 }
}
