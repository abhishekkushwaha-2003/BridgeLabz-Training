package com.artify;

//DigitalArt class extending Artwork
public class DigitalArt extends Artwork {

	public DigitalArt(String title, String artist, double price) {
		super(title, artist, price);
	}

	// Purchase logic for digital art
	@Override
	public void purchase(User user) {

		// Deduct user wallet balance
		if (user.deductBalance(price)) {
			System.out.println("Digital artwork purchased: " + title);
		}
	}

	// Licensing logic for digital art
	@Override
	public void license() {

		// Digital art supports multiple licenses
		licenseType = "Personal & Commercial License";
		System.out.println("License applied: " + licenseType);
	}
}
