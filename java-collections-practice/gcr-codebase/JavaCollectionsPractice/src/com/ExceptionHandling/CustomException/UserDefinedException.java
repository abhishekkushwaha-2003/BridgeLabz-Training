package com.ExceptionHandling.CustomException;

import java.util.Scanner;

class UserDefinedException {

    // Method to validate age
    static void validateAge(int age) throws InvalidAgeException {

        if (age < 18) {
            // Throw custom exception
            throw new InvalidAgeException("Age must be 18 or above");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Take age input from user
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            // Validate age
            validateAge(age);

            // If no exception occurs
            System.out.println("Access granted!");

        } catch (InvalidAgeException e) {
            // Handle custom exception
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}

