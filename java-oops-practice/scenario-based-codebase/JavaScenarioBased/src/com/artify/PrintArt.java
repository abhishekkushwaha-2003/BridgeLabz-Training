package com.artify;

//PrintArt class extending Artwork
public class PrintArt extends Artwork {

	public PrintArt(String title, String artist, double price) {
		super(title, artist, price);
	}

	// Purchase logic for print art
	@Override
	public void purchase(User user) {

		// Deduct user wallet balance
		if (user.deductBalance(price)) {
			System.out.println("Print artwork purchased: " + title);
		}
	}

	// Licensing logic for print art
	@Override
	public void license() {

		// Print art has limited copy license
		licenseType = "Limited Print License";
		System.out.println("License applied: " + licenseType);
	}
}
