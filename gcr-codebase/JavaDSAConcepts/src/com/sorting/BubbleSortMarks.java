package com.sorting;

public class BubbleSortMarks {

    public static void bubbleSort(int[] marks) {
        int n = marks.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    // Swap
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps occurred, array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] marks = {78, 45, 89, 62, 55, 91};

        System.out.println("Before Sorting:");
        for (int m : marks) {
            System.out.print(m + " ");
        }

        bubbleSort(marks);

        System.out.println("\nAfter Sorting (Ascending):");
        for (int m : marks) {
            System.out.print(m + " ");
        }
    }
}

