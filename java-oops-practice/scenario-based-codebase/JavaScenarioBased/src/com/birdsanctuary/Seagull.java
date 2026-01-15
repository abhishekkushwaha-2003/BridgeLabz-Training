package com.birdsanctuary;

public class Seagull extends Bird implements Flyable, Swimmable {

    public Seagull(String id, String name) {
        super(id, name, "Seagull");
    }

    public void fly() {
        System.out.println(getName() + " is flying near the sea.");
    }

    public void swim() {
        System.out.println(getName() + " is floating on water.");
    }
}
