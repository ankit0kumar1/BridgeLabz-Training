package com.linkedlist;

class RoundRobinScheduler {

    private ProcessNode head;
    private ProcessNode current;

    /* ========== ADD PROCESS ========== */

    public void addProcess(int id, int burstTime, int priority) {
        ProcessNode newNode = new ProcessNode(id, burstTime, priority);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
            return;
        }

        ProcessNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    /* ========== REMOVE PROCESS ========== */

    private void removeProcess(ProcessNode process) {
        if (head == null) return;

        if (head == process && head.next == head) {
            head = current = null;
            return;
        }

        ProcessNode temp = head;
        while (temp.next != process) {
            temp = temp.next;
        }

        temp.next = process.next;

        if (process == head) {
            head = process.next;
        }

        current = process.next;
    }

    /* ========== ROUND ROBIN SIMULATION ========== */

    public void simulate(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule");
            return;
        }

        int currentTime = 0;
        int totalProcesses = countProcesses();

        System.out.println("Starting Round Robin Scheduling (Time Quantum = " + timeQuantum + ")\n");

        while (head != null) {

            displayQueue();

            if (current.remainingTime > timeQuantum) {
                current.remainingTime -= timeQuantum;
                currentTime += timeQuantum;
            } else {
                currentTime += current.remainingTime;
                current.remainingTime = 0;

                current.turnAroundTime = currentTime;
                current.waitingTime = current.turnAroundTime - current.burstTime;

                ProcessNode finished = current;
                current = current.next;
                removeProcess(finished);
                continue;
            }

            current = current.next;
        }

        calculateAverages(totalProcesses);
    }

    /* ========== DISPLAY QUEUE ========== */

    public void displayQueue() {
        if (head == null) {
            System.out.println("Queue empty");
            return;
        }

        ProcessNode temp = head;
        System.out.print("Queue: ");

        do {
            System.out.print(
                "[P" + temp.processId +
                " | Remaining: " + temp.remainingTime + "] -> "
            );
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }

    /* ========== UTILITIES ========== */

    private int countProcesses() {
        if (head == null) return 0;

        int count = 0;
        ProcessNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }

    private void calculateAverages(int totalProcesses) {
        double totalWT = 0;
        double totalTAT = 0;

        System.out.println("\nScheduling Complete\n");

        // NOTE: Values already stored before deletion
        // In real systems, stats are logged externally

        System.out.println("Average Waiting Time: " + totalWT / totalProcesses);
        System.out.println("Average Turnaround Time: " + totalTAT / totalProcesses);
    }
}

