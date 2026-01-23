package com.Regex.AdvanceProblems;

public class SSNValidator {
    public static void main(String[] args) {

        String[] ssns = {
            "123-45-6789",
            "123456789"
        };

        // SSN format: XXX-XX-XXXX
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";

        for (String ssn : ssns) {
            System.out.println(ssn + " → " + ssn.matches(regex));
        }
    }
}
