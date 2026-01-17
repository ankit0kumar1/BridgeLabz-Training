package com.fleetmanager;

class FleetManager {

    public static void mergeSort(Vehicle[] vehicles, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(vehicles, left, mid);
            mergeSort(vehicles, mid + 1, right);

            merge(vehicles, left, mid, right);
        }
    }

    private static void merge(Vehicle[] vehicles, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        Vehicle[] leftArr = new Vehicle[n1];
        Vehicle[] rightArr = new Vehicle[n2];

        for (int i = 0; i < n1; i++)
            leftArr[i] = vehicles[left + i];
        for (int j = 0; j < n2; j++)
            rightArr[j] = vehicles[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Merge based on mileage
        while (i < n1 && j < n2) {
            if (leftArr[i].mileage <= rightArr[j].mileage) {
                vehicles[k++] = leftArr[i++];
            } else {
                vehicles[k++] = rightArr[j++];
            }
        }

        while (i < n1)
            vehicles[k++] = leftArr[i++];

        while (j < n2)
            vehicles[k++] = rightArr[j++];
    }

    public static void main(String[] args) {

        Vehicle[] fleet = {
            new Vehicle("V101", 12000),
            new Vehicle("V102", 15000),
            new Vehicle("V103", 18000),
            new Vehicle("V104", 11000),
            new Vehicle("V105", 14000),
            new Vehicle("V106", 20000)
        };

        mergeSort(fleet, 0, fleet.length - 1);

        System.out.println("Vehicle Maintenance Schedule (by mileage):");
        for (Vehicle v : fleet) {
            System.out.println(v.vehicleId + " -> " + v.mileage);
        }
    }
}
