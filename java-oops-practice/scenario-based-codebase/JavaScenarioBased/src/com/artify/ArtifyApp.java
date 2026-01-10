package com.artify;

public class ArtifyApp {

    // Main method – program execution starts here
    public static void main(String[] args) {

        // Create a user with wallet balance
        User user = new User("Amit", 5000);

        //  Create digital artwork
        Artwork digitalArt = new DigitalArt(
                "Sunset Bliss",
                "Rajeev Kumar",
                2500
        );

        //  Create print artwork
        Artwork printArt = new PrintArt(
                "Mountain View",
                "Abhishek Sharma",
                1500
        );

        //  Purchase digital artwork
        // Wallet balance will be deducted
        digitalArt.purchase(user);

        // Apply license on digital artwork
        digitalArt.license();

        //  Purchase print artwork
        printArt.purchase(user);

        // Apply license on print artwork
        printArt.license();

        //  Display remaining wallet balance
        System.out.println("Remaining Wallet Balance: ₹" + user.getWalletBalance());
    }
}

