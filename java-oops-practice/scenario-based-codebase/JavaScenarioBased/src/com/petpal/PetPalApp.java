package com.petpal;

//main application class
public class PetPalApp {

 public static void main(String[] args) {

     // creating pets using polymorphism
     Pet pet1 = new Dog("Tommy", 3);
     Pet pet2 = new Cat("Lucy", 2);
     Pet pet3 = new Bird("Koyal", 1);

     // interacting with dog
     pet1.makeSound();
     pet1.feed();
     pet1.play();
     pet1.showStatus();

     System.out.println("-------------------");

     // interacting with cat
     pet2.makeSound();
     pet2.play();
     pet2.sleep();
     pet2.showStatus();

     System.out.println("-------------------");

     // interacting with bird
     pet3.makeSound();
     pet3.feed();
     pet3.sleep();
     pet3.showStatus();
 }
}
