package com.searching.stringbuilder;

//create a class StringBuilder to Reverse a String Using StringBuilder
class StringBuilderReverse {

 // Main method 
 public static void main(String[] args) {

     // Creating the input string
     String input = "hello";

     // Creating StringBuilder object
     StringBuilder sb = new StringBuilder();

     // Appending input string to StringBuilder
     sb.append(input);

     // Reversing the string using reverse() method
     sb.reverse();

     // Converting StringBuilder back to String
     String result = sb.toString();

     // Printing the reversed string
     System.out.println(result);
 }
}

