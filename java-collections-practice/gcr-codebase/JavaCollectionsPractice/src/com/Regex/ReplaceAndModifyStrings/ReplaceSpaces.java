package com.Regex.ReplaceAndModifyStrings;

public class ReplaceSpaces {
    public static void main(String[] args) {

        String text = "This    is  an     example   with  multiple spaces.";

        // \\s+ replaces one or more spaces with single space
        String result = text.replaceAll("\\s+", " ");

        System.out.println(result);
    }
}
