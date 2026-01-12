package com.browserbuddy;

class BrowserHistory {
    private HistoryNode head;
    private HistoryNode tail;
    private HistoryNode current;

    public void addPage(String url) {
        HistoryNode newNode = new HistoryNode(url);

        // If no history yet
        if (head == null) {
            head = tail = current = newNode;
            return;
        }

        // Cut forward history if user navigates after going back
        if (current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
        }

        current.next = newNode;
        newNode.prev = current;
        tail = newNode;
        current = newNode;
    }

    public String goBack() {
        if (current != null && current.prev != null) {
            current = current.prev;
            return current.url;
        }
        return "No previous page";
    }

    public String goForward() {
        if (current != null && current.next != null) {
            current = current.next;
            return current.url;
        }
        return "No next page";
    }

    public String getCurrentPage() {
        return current != null ? current.url : "No page loaded";
    }
}

