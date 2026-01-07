package com.searching.stringbuffer;

//create a class to concatenates all strings from an array using StringBuffer
class ConcatenateStrings {

 // Main method
 public static void main(String[] args) {

     // Creating an array of strings
     String[] words = {"Java", " ", "is", " ", "powerful"};

     // Creating StringBuffer object for string concatenation
     StringBuffer buffer = new StringBuffer();

     // Looping through each string in the array
     for (int i = 0; i < words.length; i++) {

         // Appending current string to StringBuffer
         buffer.append(words[i]);
     }

     // Converting StringBuffer to String and storing result
     String result = buffer.toString();

     // Printing the final concatenated string
     System.out.println(result);
 }
}
