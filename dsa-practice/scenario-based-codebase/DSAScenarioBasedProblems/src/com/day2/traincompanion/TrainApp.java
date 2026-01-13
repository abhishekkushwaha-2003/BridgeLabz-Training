package com.day2.traincompanion;

public class TrainApp {

    public static void main(String[] args) {

        // Create TrainCompanion system
        TrainCompanion train = new TrainCompanion();

        // Add compartments
        train.addCompartment("C1", "None");
        train.addCompartment("C2", "WiFi");
        train.addCompartment("C3", "Pantry");
        train.addCompartment("C4", "None");

        // Show adjacent compartments
        train.showAdjacent();

        // Move forward
        train.moveNext();
        train.showAdjacent();

        // Search for Pantry service
        train.searchService("Pantry");

        // Remove a compartment
        train.removeCompartment("C2");

        // Move again
        train.moveNext();
        train.showAdjacent();
    }
}
