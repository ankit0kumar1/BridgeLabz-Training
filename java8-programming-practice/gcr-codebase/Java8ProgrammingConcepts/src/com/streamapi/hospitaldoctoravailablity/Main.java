package com.streamapi.hospitaldoctoravailablity;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Doctor> list = Arrays.asList(
				new Doctor("Dr. Aryan", "ENT", false),
				new Doctor("Dr. Ankit", "Neurologist", true),
				new Doctor("Dr. Rahul", "Neurology", true),
	            new Doctor("Dr. Priya", "Orthopedics", true),
	            new Doctor("Dr. Simran", "Cardiology", false)
				
				);
		List<Doctor> weekenDoctors = list.stream()
				.filter(d -> d.isAvailableOnWeekend())
				.sorted(Comparator.comparing(Doctor:: getSpeciality))
				.collect(Collectors.toList());
		System.out.println("Doctors Available on Weekends");
		weekenDoctors.forEach(System.out::println);
	}
}
