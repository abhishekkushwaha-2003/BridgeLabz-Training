package com.medistore;

	// Interface defining selling behavior for medicines
	public interface ISellable {

	    // Method to sell medicine
	    void sell(int units);

	    // Method to check expiry of medicine
	    boolean checkExpiry();
	}

