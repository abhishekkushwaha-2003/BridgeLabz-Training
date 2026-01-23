package com.Regex.AdvanceProblems;

public class CreditCardValidator {
    public static void main(String[] args) {

        String[] cards = {
            "4123456789012345",
            "5123456789012345",
            "6123456789012345"
        };

        // Visa starts with 4, MasterCard with 5 (16 digits)
        String regex = "^(4|5)\\d{15}$";

        for (String card : cards) {
            System.out.println(card + " → " + card.matches(regex));
        }
    }
}
