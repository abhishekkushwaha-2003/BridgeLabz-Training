package com.birdsanctuary;

import java.util.ArrayList;
import java.lang.reflect.Method;

@DeveloperInfo(developerName = "Abhishek", version = "1.0")
public class SanctuaryManager {

    private ArrayList<Bird> birds = new ArrayList<>();

    // Add bird
    public void addBird(Bird bird) {
        birds.add(bird);
    }

    // Display all birds
    public void displayAllBirds() {
        for (Bird b : birds) {
            b.displayInfo();
            b.eat();

            // Polymorphism using instanceof
            if (b instanceof Flyable) {
                ((Flyable) b).fly();
            }
            if (b instanceof Swimmable) {
                ((Swimmable) b).swim();
            }
            System.out.println("--------------------");
        }
    }

    // Remove bird by ID
    public void removeBirdById(String id) {
        birds.removeIf(b -> b.getId().equals(id));
    }

    // Sanctuary Report
    public void generateReport() {
        int fly = 0, swim = 0, both = 0, neither = 0;

        for (Bird b : birds) {
            boolean canFly = b instanceof Flyable;
            boolean canSwim = b instanceof Swimmable;

            if (canFly && canSwim) both++;
            else if (canFly) fly++;
            else if (canSwim) swim++;
            else neither++;
        }

        System.out.println("Sanctuary Report:");
        System.out.println("Flyable: " + fly);
        System.out.println("Swimmable: " + swim);
        System.out.println("Both: " + both);
        System.out.println("Neither: " + neither);
    }

    // 🔍 Reflection Example
    public void showDeveloperInfo() {
        Class<?> cls = this.getClass();

        if (cls.isAnnotationPresent(DeveloperInfo.class)) {
            DeveloperInfo info = cls.getAnnotation(DeveloperInfo.class);
            System.out.println("Developer: " + info.developerName());
            System.out.println("Version: " + info.version());
        }
    }
}

