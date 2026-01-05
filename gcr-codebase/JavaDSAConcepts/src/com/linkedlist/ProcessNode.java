package com.linkedlist;

class ProcessNode {
    int processId;
    int burstTime;
    int remainingTime;
    int priority;

    int waitingTime;
    int turnAroundTime;

    ProcessNode next;

    public ProcessNode(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}

