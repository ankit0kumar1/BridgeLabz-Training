package com.robowarehouse;

public class RoboWarehouse {
	public static void insertionSort(int [] packagesWeight) {
		int n = packagesWeight.length;
		for(int i =1; i < n; i++) {
			int temp = packagesWeight[i];
			int j = i-1;
			while(j>=0 && packagesWeight[j]> temp) {
				packagesWeight[j+1] = packagesWeight[j];
				j = j-1;
			}
			packagesWeight[j+1] = temp;
		}
	}
	public static void main(String[] args) {
		 int[] shelf = {10, 15, 20, 5, 18};

	        insertionSort(shelf);

	        for (int weight : shelf) {
	            System.out.print(weight + " ");
	        }
	}
}
