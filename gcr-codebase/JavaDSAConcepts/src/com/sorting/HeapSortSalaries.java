package com.sorting;

public class HeapSortSalaries {

    public static void heapSort(int[] salaries) {
        int n = salaries.length;

        // Step 1: Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        // Step 2: Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            // Reheapify reduced heap
            heapify(salaries, i, 0);
        }
    }

    private static void heapify(int[] salaries, int heapSize, int rootIndex) {
        int largest = rootIndex;
        int left = 2 * rootIndex + 1;
        int right = 2 * rootIndex + 2;

        // If left child is larger
        if (left < heapSize && salaries[left] > salaries[largest]) {
            largest = left;
        }

        // If right child is larger
        if (right < heapSize && salaries[right] > salaries[largest]) {
            largest = right;
        }

        // If root is not largest
        if (largest != rootIndex) {
            int swap = salaries[rootIndex];
            salaries[rootIndex] = salaries[largest];
            salaries[largest] = swap;

            // Recursively heapify the affected subtree
            heapify(salaries, heapSize, largest);
        }
    }

    public static void main(String[] args) {
        int[] salaryDemands = {60000, 45000, 80000, 50000, 75000};

        System.out.println("Before Sorting:");
        for (int s : salaryDemands) {
            System.out.print(s + " ");
        }

        heapSort(salaryDemands);

        System.out.println("\nAfter Sorting (Ascending):");
        for (int s : salaryDemands) {
            System.out.print(s + " ");
        }
    }
}
