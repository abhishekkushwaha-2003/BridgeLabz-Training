// Program for Number Guessing Game where computer guesses the number

// Scanner for taking user input
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    // Method to generate a random guess between given range
	
    public static int generateGuess(int low, int high) {

        // Create Random object
        Random random = new Random();

        // Generate and return random number
        return random.nextInt(high - low + 1) + low;
    }

    // Method to take feedback from user
	
    public static char getUserFeedback(Scanner input) {

        // Ask user for feedback
		
        System.out.print("Is the guess high (H), low (L), or correct (C)? ");
        return input.next().charAt(0);
    }

    // Method to update range based on feedback
	
    public static int[] updateRange(char feedback, int guess, int low, int high) {

        // If guess is too high
		
        if (feedback == 'H' || feedback == 'h') {
            high = guess - 1;
        }
        // If guess is too low
		
        else if (feedback == 'L' || feedback == 'l') {
            low = guess + 1;
        }

        return new int[] { low, high };
    }

    public static void main(String[] args) {

        // Create Scanner object to take input
		
        Scanner input = new Scanner(System.in);

        // Initial range values
		
        int low = 1;
        int high = 100;

        // Variable to store computer guess
        int guess;

        // Variable to store user feedback
        char feedback;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("Computer will try to guess it.");

        // Loop until correct guess
		
        while (true) {

            // Generate computer guess
            guess = generateGuess(low, high);

            // Display guess
			
            System.out.println("Computer guesses: " + guess);

            // Get feedback from user
            feedback = getUserFeedback(input);

            // If guess is correct
			
            if (feedback == 'C' || feedback == 'c') {

                System.out.println("Computer guessed the correct number!");
                break;
            }

            // Update range based on feedback
			
            int[] updatedRange = updateRange(feedback, guess, low, high);
            low = updatedRange[0];
            high = updatedRange[1];
        }

        input.close();
    }
}
