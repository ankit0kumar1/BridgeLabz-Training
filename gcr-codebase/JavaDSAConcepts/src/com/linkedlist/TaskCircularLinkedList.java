package com.linkedlist;

class TaskCircularLinkedList {

    private TaskNode head;
    private TaskNode current;

    // 1. Add at Beginning
    public void addAtBeginning(int id, String name, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    // 2. Add at End
    public void addAtEnd(int id, String name, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    // 3. Add at Specific Position (1-based)
    public void addAtPosition(int position, int id, String name, int priority, String dueDate) {
        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }

        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        TaskNode temp = head;

        for (int i = 1; i < position - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // 4. Remove by Task ID
    public void removeByTaskId(int taskId) {
        if (head == null) {
            System.out.println("Task list is empty");
            return;
        }

        TaskNode temp = head;
        TaskNode prev = null;

        do {
            if (temp.taskId == taskId) {

                if (temp == head) {
                    TaskNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }

                    if (head.next == head) {
                        head = current = null;
                    } else {
                        head = head.next;
                        last.next = head;
                        current = head;
                    }
                } else {
                    prev.next = temp.next;
                }

                System.out.println("Task removed successfully");
                return;
            }

            prev = temp;
            temp = temp.next;

        } while (temp != head);

        System.out.println("Task not found");
    }

    // 5. View Current Task & Move to Next
    public void viewCurrentAndMoveNext() {
        if (current == null) {
            System.out.println("No tasks available");
            return;
        }

        System.out.println("Current Task:");
        displayTask(current);
        current = current.next;
    }

    // 6. Display All Tasks
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks in scheduler");
            return;
        }

        System.out.println("Task List:");
        TaskNode temp = head;

        do {
            displayTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // 7. Search by Priority
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        TaskNode temp = head;
        boolean found = false;

        do {
            if (temp.priority == priority) {
                displayTask(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No tasks found with priority: " + priority);
        }
    }

    // Helper
    private void displayTask(TaskNode task) {
        System.out.println(
            "Task ID: " + task.taskId +
            ", Name: " + task.taskName +
            ", Priority: " + task.priority +
            ", Due Date: " + task.dueDate
        );
    }
}

