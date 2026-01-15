package com.artify;

//Base class representing an artwork
public abstract class Artwork implements IPurchasable {

	// Artwork title
	protected String title;

	// Artist name
	protected String artist;

	// Artwork price
	protected double price;

	// License type (protected for subclasses)
	protected String licenseType;

	// Constructor without preview
	public Artwork(String title, String artist, double price) {
		this.title = title;
		this.artist = artist;
		this.price = price;
	}

	// Constructor with preview support
	public Artwork(String title, String artist, double price, String licenseType) {
		this(title, artist, price);
		this.licenseType = licenseType;
	}
}
