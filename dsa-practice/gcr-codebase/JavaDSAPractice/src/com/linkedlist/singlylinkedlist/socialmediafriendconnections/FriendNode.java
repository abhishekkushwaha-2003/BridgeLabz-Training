package com.linkedlist.singlylinkedlist.socialmediafriendconnections;

//node for friend id list
class FriendNode {
 int friendId;
 FriendNode next;

 FriendNode (int friendId) {
     this.friendId = friendId;
     this.next = null;
 }
}