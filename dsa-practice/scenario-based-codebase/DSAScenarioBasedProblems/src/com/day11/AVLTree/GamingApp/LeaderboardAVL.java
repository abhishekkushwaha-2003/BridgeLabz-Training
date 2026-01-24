package com.day11.AVLTree.GamingApp;

// create a class to  handles all AVL Tree operations

public class LeaderboardAVL {

 private PlayerNode root;

 // returns height of a node
 private int height(PlayerNode node) {
     if (node == null)
         return 0;
     return node.height;
 }

 // calculates balance factor
 private int getBalance(PlayerNode node) {
     if (node == null)
         return 0;
     return height(node.left) - height(node.right);
 }

 // right rotation
 private PlayerNode rightRotate(PlayerNode y) {
     PlayerNode x = y.left;
     PlayerNode t2 = x.right;

     x.right = y;
     y.left = t2;

     // update heights
     y.height = Math.max(height(y.left), height(y.right)) + 1;
     x.height = Math.max(height(x.left), height(x.right)) + 1;

     return x;
 }

 // left rotation
 private PlayerNode leftRotate(PlayerNode x) {
     PlayerNode y = x.right;
     PlayerNode t2 = y.left;

     y.left = x;
     x.right = t2;

     // update heights
     x.height = Math.max(height(x.left), height(x.right)) + 1;
     y.height = Math.max(height(y.left), height(y.right)) + 1;

     return y;
 }

 // insert new player or updated score
 private PlayerNode insert(PlayerNode node, int playerId, int score) {

     // normal BST insertion
     if (node == null)
         return new PlayerNode(playerId, score);

     if (score < node.score)
         node.left = insert(node.left, playerId, score);
     else if (score > node.score)
         node.right = insert(node.right, playerId, score);
     else
         return node; 

     // update height
     node.height = 1 + Math.max(height(node.left), height(node.right));

     // check balance
     int balance = getBalance(node);

     // LL case
     if (balance > 1 && score < node.left.score)
         return rightRotate(node);

     // RR case
     if (balance < -1 && score > node.right.score)
         return leftRotate(node);

     // LR case
     if (balance > 1 && score > node.left.score) {
         node.left = leftRotate(node.left);
         return rightRotate(node);
     }

     // RL case
     if (balance < -1 && score < node.right.score) {
         node.right = rightRotate(node.right);
         return leftRotate(node);
     }

     return node;
 }

 // public method to add or update player
 public void addOrUpdatePlayer(int playerId, int score) {
     root = insert(root, playerId, score);
 }

 // find smallest node
 private PlayerNode minValueNode(PlayerNode node) {
     PlayerNode current = node;
     while (current.left != null)
         current = current.left;
     return current;
 }

 // delete player by score
 private PlayerNode delete(PlayerNode node, int score) {

     if (node == null)
         return node;

     if (score < node.score)
         node.left = delete(node.left, score);
     else if (score > node.score)
         node.right = delete(node.right, score);
     else {
         // node with one or no child
         if (node.left == null || node.right == null) {
             node = (node.left != null) ? node.left : node.right;
         } else {
             // node with two children
             PlayerNode temp = minValueNode(node.right);
             node.score = temp.score;
             node.right = delete(node.right, temp.score);
         }
     }

     if (node == null)
         return node;

     // update height
     node.height = Math.max(height(node.left), height(node.right)) + 1;

     // rebalance
     int balance = getBalance(node);

     if (balance > 1 && getBalance(node.left) >= 0)
         return rightRotate(node);

     if (balance > 1 && getBalance(node.left) < 0) {
         node.left = leftRotate(node.left);
         return rightRotate(node);
     }

     if (balance < -1 && getBalance(node.right) <= 0)
         return leftRotate(node);

     if (balance < -1 && getBalance(node.right) > 0) {
         node.right = rightRotate(node.right);
         return leftRotate(node);
     }

     return node;
 }

 // public remove method
 public void removePlayer(int score) {
     root = delete(root, score);
 }

 // used to display top players
 private int count = 0;

 private void reverseInOrder(PlayerNode node) {
     if (node == null || count >= 10)
         return;

     reverseInOrder(node.right);

     if (count < 10) {
         System.out.println("Player ID: " + node.playerId + " | Score: " + node.score);
         count++;
     }

     reverseInOrder(node.left);
 }

 // display top 10 players
 public void displayTopPlayers() {
     count = 0;
     reverseInOrder(root);
 }
}
