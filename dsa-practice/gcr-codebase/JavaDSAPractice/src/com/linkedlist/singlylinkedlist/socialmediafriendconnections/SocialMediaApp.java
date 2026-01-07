package com.linkedlist.singlylinkedlist.socialmediafriendconnections;

public class SocialMediaApp {

    public static void main(String[] args) {

        SocialNetwork network = new SocialNetwork();

        //adding users
        network.addUser(1, "Abhi", 21);
        network.addUser(2, "Rahul", 22);
        network.addUser(3, "Neha", 20);
        network.addUser(4, "Pooja", 23);

        //adding friends
        network.addFriend(1, 2);
        network.addFriend(1, 3);
        network.addFriend(2, 3);
        network.addFriend(2, 4);

        System.out.println("-------------");

        network.displayFriends(1);

        System.out.println("-------------");

        network.findMutualFriends(1, 2);

        System.out.println("-------------");

        network.countFriends();

        System.out.println("-------------");

        network.searchUser(3, "");
    }
}
