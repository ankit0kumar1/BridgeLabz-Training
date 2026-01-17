package com.cropmonitor;

class CropMonitor {

	public static void quickSort(int[] timestamps, int low, int high) {
		if (low < high) {
			int pivotIndex = partition(timestamps, low, high);

			quickSort(timestamps, low, pivotIndex - 1);
			quickSort(timestamps, pivotIndex + 1, high);
		}
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high]; // last element as pivot
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	public static void main(String[] args) {
		int[] sensorTimestamps = { 12501, 12507, 12502, 12509 };

		quickSort(sensorTimestamps, 0, sensorTimestamps.length - 1);

		for (long t : sensorTimestamps) {
			System.out.print(t + " ");
		}
	}
}
