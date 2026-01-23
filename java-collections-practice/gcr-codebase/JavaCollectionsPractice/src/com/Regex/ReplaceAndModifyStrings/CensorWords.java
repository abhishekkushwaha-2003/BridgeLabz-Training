package com.Regex.ReplaceAndModifyStrings;

public class CensorWords {
    public static void main(String[] args) {

        String text = "This is a damn bad example with some stupid words.";

        // Bad words list using OR (|)
        String regex = "\\b(damn|stupid)\\b";

        // Replace bad words with ****
        String result = text.replaceAll(regex, "****");

        System.out.println(result);
    }
}
