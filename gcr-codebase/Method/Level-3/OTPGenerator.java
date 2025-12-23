// Create a program to generate 6-digit OTP numbers
// and ensure 10 OTPs generated are unique

public class OTPGenerator {

    public static void main(String[] args) {

       // total OTPs to generate
	   
	    int otpCount = 10; 
		
        int[] otpArray = new int[otpCount];

        // generate OTPs and store in array
		
        for (int i = 0; i < otpCount; i++) {
            otpArray[i] = generateOTP();
        }

        // display generated OTPs
		
        System.out.println("Generated OTPs:");
        for (int i = 0; i < otpArray.length; i++) {
            System.out.println((i + 1) + ": " + otpArray[i]);
        }

        // check if OTPs are unique
		
        boolean unique = areOTPsUnique(otpArray);
        System.out.println("Are all OTPs unique? " + unique);
    }

    // Method to generate a 6-digit OTP using Math.random()
	
    public static int generateOTP() {

        // Math.random() gives value between 0.0 and 1.0
        // multiply by 900000 and add 100000 to get 6-digit number
		
        int otp = (int)(Math.random() * 900000) + 100000;
        return otp;
    }

    // Method to check if all OTPs in array are unique
	
    public static boolean areOTPsUnique(int[] otpArray) {

        for (int i = 0; i < otpArray.length; i++) {
            for (int j = i + 1; j < otpArray.length; j++) {
                if (otpArray[i] == otpArray[j]) {
                    return false; 
                }
            }
        }
        return true;
    }
}
