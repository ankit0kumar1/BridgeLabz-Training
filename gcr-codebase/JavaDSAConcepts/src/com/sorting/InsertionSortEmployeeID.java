package com.sorting;

public class InsertionSortEmployeeID {

    public static void insertionSort(int[] empIds) {
        int n = empIds.length;

        for (int i = 1; i < n; i++) {
            int key = empIds[i];   // element to be inserted
            int j = i - 1;

            // Shift elements of the sorted part that are greater than key
            while (j >= 0 && empIds[j] > key) {
                empIds[j + 1] = empIds[j];
                j--;
            }

            // Insert key at correct position
            empIds[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] empIds = {105, 102, 110, 101, 108};

        System.out.println("Before Sorting:");
        for (int id : empIds) {
            System.out.print(id + " ");
        }

        insertionSort(empIds);

        System.out.println("\nAfter Sorting (Ascending):");
        for (int id : empIds) {
            System.out.print(id + " ");
        }
    }
}

