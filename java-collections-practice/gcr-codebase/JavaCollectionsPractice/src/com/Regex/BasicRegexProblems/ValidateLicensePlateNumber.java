package com.Regex.BasicRegexProblems;

public class  ValidateLicensePlateNumber {

    public static void main(String[] args) {

        // Sample license plate numbers to validate
        String[] plates = {"AB1234", "A12345",  "ab1234", "AB12C4", "XYZ123"};

        String regex = "^[A-Z]{2}[0-9]{4}$";

        // Loop through each license plate
        for (String plate : plates) {

            // matches() checks the ENTIRE string against regex
            if (plate.matches(regex)) {
                System.out.println(plate + " → Valid");
            } else {
                System.out.println(plate + " → Invalid");
            }
        }
    }
}

