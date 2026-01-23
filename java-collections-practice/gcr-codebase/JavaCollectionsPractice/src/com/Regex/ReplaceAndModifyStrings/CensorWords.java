package com.Regex.ReplaceAndModifyStrings;

public class CensorWords {
    public static void main(String[] args) {

        String text = "I am an Engineer and I am learning the advance coding concepts.";

        // Bad words list using OR (|)
        String regex = "\\b(Engineer|learning)\\b";

        // Replace bad words with ****
        String result = text.replaceAll(regex, "****");

        System.out.println(result);
    }
}
