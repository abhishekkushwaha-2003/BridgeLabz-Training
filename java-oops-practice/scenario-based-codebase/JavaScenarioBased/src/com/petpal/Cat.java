package com.petpal;

//cat class
class Cat extends Pet {

 public Cat(String name, int age) {
     super(name, "Cat", age);
 }

 // different sound
 void makeSound() {
     System.out.println(name + " says: Meow!");
 }
}
