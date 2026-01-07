package com.linkedlist.singlylinkedlist.socialmediafriendconnections;

//node for user
class UserNode {

 int userId;
 String name;
 int age;

 FriendNode friendHead; // list of friend ids
 UserNode next;         // next user

 // constructor
 UserNode(int userId, String name, int age) {
     this.userId = userId;
     this.name = name;
     this.age = age;
     this.friendHead = null;
     this.next = null;
 }
}
