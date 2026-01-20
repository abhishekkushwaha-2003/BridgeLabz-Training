package com.ExceptionHandling.CustomException;

//Custom exception class
class InvalidAgeException extends Exception {

 // Constructor with custom message
 InvalidAgeException(String message) {
     super(message);
 }
}
