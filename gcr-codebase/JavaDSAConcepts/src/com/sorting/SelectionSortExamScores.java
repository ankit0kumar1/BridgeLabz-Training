package com.sorting;
public class SelectionSortExamScores {

    public static void selectionSort(int[] scores) {
        int n = scores.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find index of minimum element in unsorted part
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap if a smaller element is found
            if (minIndex != i) {
                int temp = scores[i];
                scores[i] = scores[minIndex];
                scores[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] examScores = {72, 88, 65, 90, 79, 56};

        System.out.println("Before Sorting:");
        for (int s : examScores) {
            System.out.print(s + " ");
        }

        selectionSort(examScores);

        System.out.println("\nAfter Sorting (Ascending):");
        for (int s : examScores) {
            System.out.print(s + " ");
        }
    }
}

