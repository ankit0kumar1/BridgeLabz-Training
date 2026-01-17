package com.fleetmanager;

class FleetManager {

    public static void mergeSort(int[] mileage, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(mileage, left, mid);
            mergeSort(mileage, mid + 1, right);

            merge(mileage, left, mid, right);
        }
    }

    private static void merge(int[] mileage, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; i++)
            leftArr[i] = mileage[left + i];
        for (int j = 0; j < n2; j++)
            rightArr[j] = mileage[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Merge sorted arrays
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                mileage[k++] = leftArr[i++];
            } else {
                mileage[k++] = rightArr[j++];
            }
        }

        while (i < n1)
            mileage[k++] = leftArr[i++];

        while (j < n2)
            mileage[k++] = rightArr[j++];
    }

    public static void main(String[] args) {
        int[] vehicles = {12000, 15000, 18000, 11000, 14000, 20000};

        mergeSort(vehicles, 0, vehicles.length - 1);

        for (int km : vehicles) {
            System.out.print(km + " ");
        }
    }
}

