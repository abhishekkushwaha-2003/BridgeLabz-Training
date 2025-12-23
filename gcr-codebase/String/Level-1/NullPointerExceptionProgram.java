// Write a program to demonstrate NullPointerException
// First generate the exception, then handle it using try-catch

// Create a class NullPointerException
public class NullPointerException {

    // Method to generate NullPointerException
    static void generateException() {

        // Declare string variable and assign null
        String text = null;

        // This will generate NullPointerException
        System.out.println(text.length());
    }

    // Method to handle NullPointerException
    static void handleException() {

        // Declare string variable and assign null
        String text = null;

        // Handle exception using try-catch
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled successfully");
        }
    }

    // Main method
    // Call method to generate exception and then handle it
    public static void main(String[] args) {

        // Calling method to generate exception
        // generateException();   // Uncomment to see exception

        // Calling method to handle exception
        handleException();
    }
}
