package com.sorting;

public class QuickSortProductPrices {

    public static void quickSort(int[] prices, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(prices, low, high);

            // Sort left of pivot
            quickSort(prices, low, pivotIndex - 1);

            // Sort right of pivot
            quickSort(prices, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] prices, int low, int high) {
        int pivot = prices[high];  // pivot element
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (prices[j] < pivot) {
                i++;
                // swap prices[i] and prices[j]
                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        // place pivot in correct position
        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] productPrices = {999, 299, 799, 199, 499, 149};

        System.out.println("Before Sorting:");
        for (int p : productPrices) {
            System.out.print(p + " ");
        }

        quickSort(productPrices, 0, productPrices.length - 1);

        System.out.println("\nAfter Sorting (Ascending):");
        for (int p : productPrices) {
            System.out.print(p + " ");
        }
    }
}

