package com.linkedlist;

public class SocialMediaApp {
    public static void main(String[] args) {

        SocialMediaLinkedList network = new SocialMediaLinkedList();

        network.addUser(1, "Ankit", 21);
        network.addUser(2, "Riya", 20);
        network.addUser(3, "Rahul", 22);
        network.addUser(4, "Neha", 21);

        network.addFriendConnection(1, 2);
        network.addFriendConnection(1, 3);
        network.addFriendConnection(2, 3);
        network.addFriendConnection(2, 4);

        network.displayFriends(2);

        network.findMutualFriends(1, 2);

        network.removeFriendConnection(1, 3);

        network.displayFriends(1);

        network.searchUserByName("Rahul");

        System.out.println();
        network.countFriendsForEachUser();
    }
}
