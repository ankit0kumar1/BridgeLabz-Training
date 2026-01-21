package com.foodfest;

class FoodFest {

    public static void mergeSort(Stall[] stalls, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(stalls, left, mid);
            mergeSort(stalls, mid + 1, right);

            merge(stalls, left, mid, right);
        }
    }

    private static void merge(Stall[] stalls, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        Stall[] leftArr = new Stall[n1];
        Stall[] rightArr = new Stall[n2];

        for (int i = 0; i < n1; i++)
            leftArr[i] = stalls[left + i];
        for (int j = 0; j < n2; j++)
            rightArr[j] = stalls[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Merge by footfall (descending for ranking)
        while (i < n1 && j < n2) {
            if (leftArr[i].footfall >= rightArr[j].footfall) {
                stalls[k++] = leftArr[i++];
            } else {
                stalls[k++] = rightArr[j++];
            }
        }

        while (i < n1)
            stalls[k++] = leftArr[i++];

        while (j < n2)
            stalls[k++] = rightArr[j++];
    }

    public static void main(String[] args) {

        Stall[] masterList = {
            new Stall("Burger Barn", 520),
            new Stall("Taco Town", 480),
            new Stall("Pasta Point", 520),
            new Stall("Curry Corner", 450),
            new Stall("Dessert Den", 500)
        };

        mergeSort(masterList, 0, masterList.length - 1);

        System.out.println("FoodFest Stall Ranking (by footfall):");
        for (Stall s : masterList) {
            System.out.println(s);
        }
    }
}

