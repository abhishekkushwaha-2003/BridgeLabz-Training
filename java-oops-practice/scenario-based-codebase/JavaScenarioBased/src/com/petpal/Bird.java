package com.petpal;

//bird class
class Bird extends Pet {

 public Bird(String name, int age) {
     super(name, "Bird", age);
 }

 // different sound
 void makeSound() {
     System.out.println(name + " says: cuckoo cuckoo!");
 }
}

