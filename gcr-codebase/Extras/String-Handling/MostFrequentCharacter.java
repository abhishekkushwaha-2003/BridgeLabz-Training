// Program to find the most frequent character in a string

// Scanner for taking user input
import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {

        // Create Scanner object to take input
		
        Scanner input = new Scanner(System.in);

        // Take string input from user
		
        System.out.print("Enter a string: ");
        String inputString = input.nextLine();

        // Variable to store most frequent character
		
        char mostFrequentChar = inputString.charAt(0);

        // Variable to store maximum count
		
        int maxCount = 0;

        // Loop to pick one character at a time
		
        for (int i = 0; i < inputString.length(); i++) {

            // Variable to count frequency of current character
            int count = 0;

            // Loop to count how many times current character appears
			
            for (int j = 0; j < inputString.length(); j++) {

                // Check if characters are same
				
                if (inputString.charAt(i) == inputString.charAt(j)) {
                    count++;
                }
            }

            // Update most frequent character if count is greater
			
            if (count > maxCount) {
                maxCount = count;
                mostFrequentChar = inputString.charAt(i);
            }
        }

        // Display the most frequent character
		
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");

        input.close();
    }
}
