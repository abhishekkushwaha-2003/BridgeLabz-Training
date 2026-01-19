package com.BagnBallOrganizer;

//Main class 
public class BagOrganizerApp {

 public static void main(String[] args) {

     // Create bags
     Bag bag1 = new Bag("BAG101", "Red", 2);
     Bag bag2 = new Bag("BAG102", "Blue", 3);

     // Create balls
     Ball ball1 = new Ball("BALL1", "Yellow", "Small");
     Ball ball2 = new Ball("BALL2", "Green", "Medium");
     Ball ball3 = new Ball("BALL3", "Blue", "Large");

     // Add balls to bags
     bag1.addBall(ball1);
     bag1.addBall(ball2);
     bag1.addBall(ball3); // should fail capacity exceeded

     bag2.addBall(ball3);

     System.out.println();

     // Display bag details
     bag1.displayInfo();
     bag1.displayBalls();

     System.out.println();

     bag2.displayInfo();
     bag2.displayBalls();

     System.out.println();

     // Remove a ball
     bag1.removeBall("BALL1");
     bag1.displayBalls();
 }
}
