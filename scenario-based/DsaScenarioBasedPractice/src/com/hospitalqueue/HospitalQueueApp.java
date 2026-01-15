package com.hospitalqueue;

public class HospitalQueueApp {
	public static void main(String[] args) {
		Patient [] patients = {
				new Patient("Rohan", 1, 8),
				new Patient("Sohan", 2, 4),
				new Patient("Mohan", 3, 9),
				new Patient("Prem", 4, 10),
				new Patient("Amit", 5, 2),
				new Patient("Preet", 6, 5)
				
		};
		// before sorting 
		System.out.println("Before Sorting");
		System.out.println("---------------");
		for(Patient p : patients) {
			p.display();
			System.out.println();
		}
		
		// after sorting 
		System.out.println("After sorting");
		System.out.println("---------------");
		HospitalQueue.sortByCriticality(patients);
		for(Patient p : patients) {
			p.display();
			System.out.println();
		}
		
	}
}
