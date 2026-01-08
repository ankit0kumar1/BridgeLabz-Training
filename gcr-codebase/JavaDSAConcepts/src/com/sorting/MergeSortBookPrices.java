package com.sorting;

public class MergeSortBookPrices {

    public static void mergeSort(int[] prices, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Sort left half
            mergeSort(prices, left, mid);

            // Sort right half
            mergeSort(prices, mid + 1, right);

            // Merge sorted halves
            merge(prices, left, mid, right);
        }
    }

    private static void merge(int[] prices, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data
        for (int i = 0; i < n1; i++)
            L[i] = prices[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = prices[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Merge the temp arrays
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                prices[k++] = L[i++];
            } else {
                prices[k++] = R[j++];
            }
        }

        // Copy remaining elements
        while (i < n1) {
            prices[k++] = L[i++];
        }

        while (j < n2) {
            prices[k++] = R[j++];
        }
    }

    public static void main(String[] args) {
        int[] bookPrices = {450, 299, 799, 150, 999, 349};

        System.out.println("Before Sorting:");
        for (int price : bookPrices) {
            System.out.print(price + " ");
        }

        mergeSort(bookPrices, 0, bookPrices.length - 1);

        System.out.println("\nAfter Sorting (Ascending):");
        for (int price : bookPrices) {
            System.out.print(price + " ");
        }
    }
}

