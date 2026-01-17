package com.cropmonitor;

class CropMonitor {

    public static void quickSort(Sensor[] data, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(data, low, high);

            quickSort(data, low, pivotIndex - 1);
            quickSort(data, pivotIndex + 1, high);
        }
    }

    private static int partition(Sensor[] data, int low, int high) {
        long pivot = data[high].timestamp; // pivot by timestamp
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (data[j].timestamp <= pivot) {
                i++;
                Sensor temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }

        Sensor temp = data[i + 1];
        data[i + 1] = data[high];
        data[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        Sensor[] readings = {
            new Sensor(17015, 24.6),
            new Sensor(17011, 23.9),
            new Sensor(17013, 25.1),
            new Sensor(17012, 22.8)
        };

        quickSort(readings, 0, readings.length - 1);

        System.out.println("Sensor data sorted by timestamp:");
        for (Sensor s : readings) {
            System.out.println(s.timestamp + " -> " + s.temperature);
        }
    }
}
