package com.linkedlist;

class TextEditorHistory {

    private TextStateNode head;
    private TextStateNode tail;
    private TextStateNode current;

    private int size;
    private final int MAX_HISTORY = 10;

    /* ========== ADD NEW STATE ========== */

    public void addState(String newContent) {
        TextStateNode newNode = new TextStateNode(newContent);

        // If undo was used, remove redo history
        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
        }

        if (head == null) {
            head = tail = current = newNode;
            size = 1;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        current = newNode;
        size++;

        // Enforce history limit
        if (size > MAX_HISTORY) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    /* ========== UNDO ========== */

    public void undo() {
        if (current == null || current.prev == null) {
            System.out.println("Nothing to undo");
            return;
        }

        current = current.prev;
    }

    /* ========== REDO ========== */

    public void redo() {
        if (current == null || current.next == null) {
            System.out.println("Nothing to redo");
            return;
        }

        current = current.next;
    }

    /* ========== DISPLAY CURRENT STATE ========== */

    public void displayCurrentState() {
        if (current == null) {
            System.out.println("Editor is empty");
            return;
        }

        System.out.println("Current Text:");
        System.out.println(current.content);
    }

    /* ========== DEBUG / OPTIONAL ========== */

    public void displayHistoryForward() {
        TextStateNode temp = head;
        System.out.print("History: ");
        while (temp != null) {
            if (temp == current)
                System.out.print("[* " + temp.content + " *] ");
            else
                System.out.print(temp.content + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

