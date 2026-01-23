package com.Regex.BasicRegexProblems;

public class ValidateHexColorCode {

    public static void main(String[] args) {

        // Sample hex color codes
        String[] colors ={"#FFA500", "#ff4500", "#123", "#ZZZZZZ", "FFA500", "#2FG45"};

        String regex = "^#[0-9a-fA-F]{6}$";

        // Validate each color code
        for (String color : colors) {

            // matches ensures full validation
            if (color.matches(regex)) {
                System.out.println(color + " → Valid");
            } else {
                System.out.println(color + " → Invalid");
            }
        }
    }
}

