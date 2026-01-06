package com.petpal;

//dog class
class Dog extends Pet {

 public Dog(String name, int age) {
     super(name, "Dog", age);
 }

 // different sound
 void makeSound() {
     System.out.println(name + " says: Woof Woof!");
 }
}
