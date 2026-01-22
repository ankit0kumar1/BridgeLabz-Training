package com.medwarehouse;

class MedWarehouse {

    public static void mergeSort(Medicine[] meds, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(meds, left, mid);
            mergeSort(meds, mid + 1, right);

            merge(meds, left, mid, right);
        }
    }

    private static void merge(Medicine[] meds, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        Medicine[] leftArr = new Medicine[n1];
        Medicine[] rightArr = new Medicine[n2];

        for (int i = 0; i < n1; i++)
            leftArr[i] = meds[left + i];
        for (int j = 0; j < n2; j++)
            rightArr[j] = meds[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Merge by expiry date (earliest first)
        while (i < n1 && j < n2) {
            if (leftArr[i].expiryDate <= rightArr[j].expiryDate) {
                meds[k++] = leftArr[i++];
            } else {
                meds[k++] = rightArr[j++];
            }
        }

        while (i < n1)
            meds[k++] = leftArr[i++];

        while (j < n2)
            meds[k++] = rightArr[j++];
    }

    public static void main(String[] args) {

        Medicine[] inventory = {
            new Medicine("Paracetamol", 20260310),
            new Medicine("Ibuprofen", 20260405),
            new Medicine("Cough Syrup", 20260310),
            new Medicine("Antibiotic", 20260220),
            new Medicine("Vitamin D", 20260501)
        };

        mergeSort(inventory, 0, inventory.length - 1);

        System.out.println("Medicines sorted by expiry date:");
        for (Medicine m : inventory) {
            System.out.println(m);
        }
    }
}

