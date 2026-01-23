package com.day10.BinarySearchTree.MusicApp;

public class MusicAppClass {

    public static void main(String[] args) {

        MusicLibraryBST library = new MusicLibraryBST();

        //  Insert new tracks
        
        library.insert(new Song(201, "Blender", "Masoom Sharma"));
        library.insert(new Song(105, "Gehra Hua", "Arijit Singh"));
        library.insert(new Song(310, "Apna Bana Le", "Arijit Singh"));
        library.insert(new Song(150, "Zinda", "Siddharth Mahadevan"));

        //  Search song using track ID
        library.searchByTrackId(105);

        //Show playlist alphabetically
        library.displayPlaylist();
    }
}
