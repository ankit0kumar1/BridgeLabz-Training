package com.linkedlist;


class StudentLinkedList {

    private StudentNode head;

    // 1. Add at Beginning
    public void addAtBeginning(int roll, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    // 2. Add at End
    public void addAtEnd(int roll, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);

        if (head == null) {
            head = newNode;
            return;
        }

        StudentNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // 3. Add at Specific Position (1-based index)
    public void addAtPosition(int position, int roll, String name, int age, char grade) {
        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            addAtBeginning(roll, name, age, grade);
            return;
        }

        StudentNode newNode = new StudentNode(roll, name, age, grade);
        StudentNode temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // 4. Delete by Roll Number
    public void deleteByRollNumber(int roll) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.rollNumber == roll) {
            head = head.next;
            System.out.println("Student record deleted");
            return;
        }

        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNumber != roll) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Student not found");
        } else {
            temp.next = temp.next.next;
            System.out.println("Student record deleted");
        }
    }

    // 5. Search by Roll Number
    public void searchByRollNumber(int roll) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.rollNumber == roll) {
                System.out.println("Student Found:");
                displayStudent(temp);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Student not found");
    }

    // 6. Update Grade by Roll Number
    public void updateGrade(int roll, char newGrade) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.rollNumber == roll) {
                temp.grade = newGrade;
                System.out.println("Grade updated successfully");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Student not found");
    }

    // 7. Display All Students
    public void displayAll() {
        if (head == null) {
            System.out.println("No student records available");
            return;
        }

        StudentNode temp = head;
        System.out.println("Student Records:");
        System.out.println("------------------------------");

        while (temp != null) {
            displayStudent(temp);
            temp = temp.next;
        }
    }

    // Helper method
    private void displayStudent(StudentNode student) {
        System.out.println(
            "Roll No: " + student.rollNumber +
            ", Name: " + student.name +
            ", Age: " + student.age +
            ", Grade: " + student.grade
        );
    }
}
