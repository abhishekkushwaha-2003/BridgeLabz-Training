package com.linkedlist.singlylinkedlist.socialmediafriendconnections;

class SocialNetwork{

    private UserNode head;

    // add new user
    void addUser(int id, String name, int age) {

        UserNode newUser = new UserNode(id, name, age);

        if (head == null) {
            head = newUser;
            return;
        }

        UserNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newUser;
    }

    // helper method to find user by id
    private UserNode findUserById(int id) {

        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // add friend connection between two users
    void addFriend(int userId, int friendId) {

        UserNode user = findUserById(userId);
        UserNode friend = findUserById(friendId);

        if (user == null || friend == null) {
            System.out.println("User not found");
            return;
        }

        // add friendId to user's friend list
        FriendNode newFriend = new FriendNode(friendId);
        newFriend.next = user.friendHead;
        user.friendHead = newFriend;

        // add userId to friend's friend list
        FriendNode newUserFriend = new FriendNode(userId);
        newUserFriend.next = friend.friendHead;
        friend.friendHead = newUserFriend;

        System.out.println("Friend connection added");
    }

    // remove friend connection
    void removeFriend(int userId, int friendId) {

        UserNode user = findUserById(userId);
        if (user == null) return;

        user.friendHead = removeFriendFromList(user.friendHead, friendId);

        UserNode friend = findUserById(friendId);
        if (friend != null) {
            friend.friendHead = removeFriendFromList(friend.friendHead, userId);
        }

        System.out.println("Friend connection removed");
    }

    // helper method to remove friend id
    private FriendNode removeFriendFromList(FriendNode head, int id) {

        if (head == null) return null;

        if (head.friendId == id) {
            return head.next;
        }

        FriendNode temp = head;
        while (temp.next != null && temp.next.friendId != id) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }

        return head;
    }

    // display all friends of a user
    void displayFriends(int userId) {

        UserNode user = findUserById(userId);
        if (user == null) {
            System.out.println("User not found");
            return;
        }

        System.out.println("Friends of " + user.name + ":");

        FriendNode temp = user.friendHead;
        if (temp == null) {
            System.out.println("No friends");
            return;
        }

        while (temp != null) {
            System.out.println("Friend ID: " + temp.friendId);
            temp = temp.next;
        }
    }

    // search user by id or name
    void searchUser(int id, String name) {

        UserNode temp = head;
        while (temp != null) {

            if (temp.userId == id || temp.name.equalsIgnoreCase(name)) {
                System.out.println("User Found:");
                System.out.println(temp.userId + " " + temp.name + " Age:" + temp.age);
                return;
            }
            temp = temp.next;
        }

        System.out.println("User not found");
    }

    // count friends of each user
    void countFriends() {

        UserNode temp = head;
        while (temp != null) {

            int count = 0;
            FriendNode f = temp.friendHead;
            while (f != null) {
                count++;
                f = f.next;
            }

            System.out.println(temp.name + " has " + count + " friends");
            temp = temp.next;
        }
    }

    // find mutual friends
    void findMutualFriends(int userId1, int userId2) {

        UserNode u1 = findUserById(userId1);
        UserNode u2 = findUserById(userId2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found");
            return;
        }

        System.out.println("Mutual Friends IDs:");

        FriendNode f1 = u1.friendHead;
        while (f1 != null) {

            FriendNode f2 = u2.friendHead;
            while (f2 != null) {

                if (f1.friendId == f2.friendId) {
                    System.out.println(f1.friendId);
                }
                f2 = f2.next;
            }
            f1 = f1.next;
        }
    }
}
