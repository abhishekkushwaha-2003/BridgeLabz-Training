package com.petpal;

//base class for all pets
abstract class Pet implements IInteractable {

 protected String name;
 protected String type;
 protected int age;

 // internal states (encapsulated)
 private int hunger;   // 0 = full, 100 = very hungry
 private int energy;   // 0 = tired, 100 = full energy
 private String mood;

 // constructor with user-defined values
 public Pet(String name, String type, int age) {
     this.name = name;
     this.type = type;
     this.age = age;

     // default values
     this.hunger = 50;
     this.energy = 50;
     this.mood = "Normal";
 }

 // constructor with random defaults
 public Pet(String name, String type) {
     this(name, type, 1);
 }

 // feed pet
 public void feed() {
     hunger -= 20;
     if (hunger < 0) hunger = 0;
     mood = "Happy";
     System.out.println(name + " is eating.");
 }

 // play with pet
 public void play() {
     energy -= 15;
     hunger += 10;
     mood = "Excited";
     System.out.println(name + " is playing.");
 }

 // pet sleeps
 public void sleep() {
     energy += 25;
     if (energy > 100) energy = 100;
     mood = "Relaxed";
     System.out.println(name + " is sleeping.");
 }

 // getters only (no direct access)
 public int getHunger() {
     return hunger;
 }

 public int getEnergy() {
     return energy;
 }

 public String getMood() {
     return mood;
 }

 // abstract method for sound (polymorphism)
 abstract void makeSound();

 // display pet status
 public void showStatus() {
     System.out.println("Hunger: " + hunger + ", Energy: " + energy + ", Mood: " + mood);
 }
}

