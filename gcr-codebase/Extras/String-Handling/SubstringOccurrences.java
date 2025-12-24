// Program to count how many times a substring occurs in a string

// Scanner for taking user input
import java.util.Scanner; 

public class SubstringOccurrences {
    public static void main(String[] args) {
	
	   // Create Scanner object to take input
        Scanner input = new Scanner(System.in); 

        // Take main string input from user
		
        System.out.print("Enter the main string: ");
        String mainString = input.nextLine();

        // Take substring input from user
		
        System.out.print("Enter the substring to search: ");
        String subString = input.nextLine();
		
		// Variable to store number of occurrences
        int count = 0; 
		
		// Starting index for search
        int index = 0; 

        // Loop until substring is found in the main string
		
        while ((index = mainString.indexOf(subString, index)) != -1) {
		
		  // Increase count
            count++;     

			// Move index forward
            index = index + subString.length(); 
        }

        // Display the result
		
        System.out.println("Substring occurs " + count + " times.");

        input.close(); 
    }
}
