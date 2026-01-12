package com.searching.binary;

public class PeakElementFinder {

    public static int findPeakElement(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // ascending slope → peak on the right
                left = mid + 1;
            } else {
                // descending slope or peak → peak on the left or at mid
                right = mid;
            }
        }
        // left == right → index of a peak element
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};

        int peakIndex = findPeakElement(arr);
        System.out.println("Peak index: " + peakIndex);
        System.out.println("Peak value: " + arr[peakIndex]);
    }
}

