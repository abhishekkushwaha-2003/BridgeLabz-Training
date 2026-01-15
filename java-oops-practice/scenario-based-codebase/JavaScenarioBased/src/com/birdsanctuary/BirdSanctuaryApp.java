package com.birdsanctuary;

public class BirdSanctuaryApp {

    public static void main(String[] args) {

        SanctuaryManager manager = new SanctuaryManager();

        manager.addBird(new Eagle("B101", "Rocky"));
        manager.addBird(new Duck("B102", "Daffy"));
        manager.addBird(new Penguin("B103", "Pingo"));
        manager.addBird(new Seagull("B104", "Sky"));
        manager.addBird(new Kiwi("B105", "Kiki"));

        System.out.println("Welcome to EcoWing Bird Sanctuary\n");

        manager.displayAllBirds();

        manager.generateReport();

        System.out.println("\n--- Developer Info (Using Reflection) ---");
        manager.showDeveloperInfo();
    }
}
