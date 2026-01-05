package com.linkedlist;

class SocialMediaLinkedList {

    private UserNode head;

    /* ========== ADD USER ========== */

    public void addUser(int id, String name, int age) {
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

    /* ========== FIND USER ========== */

    private UserNode findUserById(int userId) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == userId)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    public void searchUserByName(String name) {
        UserNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                displayUser(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("User not found");
    }

    public void searchUserById(int id) {
        UserNode user = findUserById(id);
        if (user != null)
            displayUser(user);
        else
            System.out.println("User not found");
    }

    /* ========== FRIEND CONNECTIONS ========== */

    public void addFriendConnection(int userId1, int userId2) {
        if (userId1 == userId2) return;

        UserNode user1 = findUserById(userId1);
        UserNode user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found");
            return;
        }

        addFriend(user1, userId2);
        addFriend(user2, userId1);

        System.out.println("Friend connection added");
    }

    private void addFriend(UserNode user, int friendId) {
        FriendNode newFriend = new FriendNode(friendId);

        if (user.friends == null) {
            user.friends = newFriend;
            return;
        }

        FriendNode temp = user.friends;
        while (temp.next != null) {
            if (temp.friendId == friendId) return; // avoid duplicates
            temp = temp.next;
        }
        temp.next = newFriend;
    }

    public void removeFriendConnection(int userId1, int userId2) {
        UserNode user1 = findUserById(userId1);
        UserNode user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("User not found");
            return;
        }

        removeFriend(user1, userId2);
        removeFriend(user2, userId1);

        System.out.println("Friend connection removed");
    }

    private void removeFriend(UserNode user, int friendId) {
        FriendNode temp = user.friends;

        if (temp == null) return;

        if (temp.friendId == friendId) {
            user.friends = temp.next;
            return;
        }

        while (temp.next != null && temp.next.friendId != friendId) {
            temp = temp.next;
        }

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    /* ========== DISPLAY FRIENDS ========== */

    public void displayFriends(int userId) {
        UserNode user = findUserById(userId);
        if (user == null) {
            System.out.println("User not found");
            return;
        }

        System.out.print("Friends of " + user.name + ": ");
        FriendNode temp = user.friends;

        if (temp == null) {
            System.out.println("No friends");
            return;
        }

        while (temp != null) {
            System.out.print(temp.friendId + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* ========== MUTUAL FRIENDS ========== */

    public void findMutualFriends(int userId1, int userId2) {
        UserNode user1 = findUserById(userId1);
        UserNode user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("User not found");
            return;
        }

        System.out.print("Mutual Friends: ");
        boolean found = false;

        FriendNode f1 = user1.friends;
        while (f1 != null) {
            FriendNode f2 = user2.friends;
            while (f2 != null) {
                if (f1.friendId == f2.friendId) {
                    System.out.print(f1.friendId + " ");
                    found = true;
                }
                f2 = f2.next;
            }
            f1 = f1.next;
        }

        if (!found)
            System.out.print("None");

        System.out.println();
    }

    /* ========== COUNT FRIENDS ========== */

    public void countFriendsForEachUser() {
        UserNode temp = head;

        while (temp != null) {
            int count = 0;
            FriendNode f = temp.friends;
            while (f != null) {
                count++;
                f = f.next;
            }
            System.out.println(temp.name + " has " + count + " friends");
            temp = temp.next;
        }
    }

    /* ========== HELPER ========== */

    private void displayUser(UserNode user) {
        System.out.println(
            "ID: " + user.userId +
            ", Name: " + user.name +
            ", Age: " + user.age
        );
    }
}

