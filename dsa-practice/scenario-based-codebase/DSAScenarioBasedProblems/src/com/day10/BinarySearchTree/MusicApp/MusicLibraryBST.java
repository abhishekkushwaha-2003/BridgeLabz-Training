package com.day10.BinarySearchTree.MusicApp;

//BST to manage music library 
public class MusicLibraryBST {

 private BSTNode root;


 // Insert new song based on title (alphabetical order)
 public void insert(Song song) {
     root = insertNode(root, song);
 }

 private BSTNode insertNode(BSTNode current, Song song) {

     if (current == null) {
         return new BSTNode(song);
     }

     // Compare titles for alphabetical order
     if (song.title.compareToIgnoreCase(current.song.title) < 0) {
         current.left = insertNode(current.left, song);
     } 
     else {
         current.right = insertNode(current.right, song);
     }

     return current;
 }

 // Search song using track ID
 public void searchByTrackId(int trackId) {
     Song result = searchTrack(root, trackId);

     if (result != null) {
         System.out.println("Song Found → " + result.title +
                 " | Artist: " + result.artist);
     } else {
         System.out.println("Song not found.");
     }
 }

 private Song searchTrack(BSTNode current, int trackId) {

     if (current == null) {
         return null;
     }

     // Check current node
     if (current.song.trackId == trackId) {
         return current.song;
     }

     // Search in left subtree
     Song leftResult = searchTrack(current.left, trackId);
     if (leftResult != null) {
         return leftResult;
     }

     // Search in right subtree
     return searchTrack(current.right, trackId);
 }

 // Display playlist in alphabetical order
 public void displayPlaylist() {
     System.out.println("Playlist (Alphabetical Order):");
     inorderTraversal(root);
 }

 private void inorderTraversal(BSTNode current) {
     if (current != null) {
         inorderTraversal(current.left);
         System.out.println("Title: " + current.song.title +
                 ", Artist: " + current.song.artist +
                 ", Track ID: " + current.song.trackId);
         inorderTraversal(current.right);
     }
 }
}
