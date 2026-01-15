package com.hospitalqueue;

public class HospitalQueue {
	static void sortByCriticality(Patient [] patients) {
		int n = patients.length;

		boolean swapped;
		for(int i =0; i<n-1; i++) {
			swapped = false;
			for(int j = 0; j < n-i-1; j++) {
				if(patients[j].criticalityLevel < patients[j+1].criticalityLevel) {
					
					Patient temp = patients[j];
					patients[j] = patients[j+1];
					patients[j+1] = temp;
					swapped = true;
					
					
				}
			}
			
		}
		
	}
}
