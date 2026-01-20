package com.ExceptionHandling.ThrowVsThrowsException;

class ThrowVsThrows{

    // Method that may throw an exception
    static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {

        // Validate input
        if (amount < 0 || rate < 0) {
            // Throwing exception explicitly
            throw new IllegalArgumentException(
                    "Amount and rate must be positive");
        }

        // Simple interest calculation
        return (amount * rate * years) / 100;
    }

    public static void main(String[] args) {

        try {
            // Valid / invalid inputs
            double interest = calculateInterest(10000, 5, 2);
            
            // here amount is negative so exception occurs
            //double interest = calculateInterest(-5000, 4, 3);

            System.out.println("Calculated Interest: " + interest);

        } catch (IllegalArgumentException e) {
            // Handle exception here
            System.out.println(
                "Invalid input: Amount and rate must be positive");
        }
    }
}
