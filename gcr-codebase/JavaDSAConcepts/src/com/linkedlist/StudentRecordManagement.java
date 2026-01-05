package com.linkedlist;

public class StudentRecordManagement {
    public static void main(String[] args) {

        StudentLinkedList list = new StudentLinkedList();

        list.addAtBeginning(101, "Ankit", 20, 'A');
        list.addAtEnd(102, "keshav", 21, 'B');
        list.addAtEnd(103, "Sanchit", 22, 'C');

        list.addAtPosition(2, 104, "Durga", 19, 'A');

        list.displayAll();

        list.searchByRollNumber(102);

        list.updateGrade(103, 'B');

        list.deleteByRollNumber(101);

        System.out.println("\nAfter Updates:");
        list.displayAll();
    }
}
