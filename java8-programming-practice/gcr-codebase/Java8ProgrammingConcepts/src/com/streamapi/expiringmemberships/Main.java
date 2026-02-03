package com.streamapi.expiringmemberships;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
public class Main {
	public static void main(String[] args) {
		List<Members> members = Arrays.asList(
                new Members(1, "Ankit", LocalDate.now().plusDays(5)),
                new Members(2, "Ravi", LocalDate.now().plusDays(45)),
                new Members(3, "Neha", LocalDate.now().plusDays(25)),
                new Members(4, "Priya", LocalDate.now().minusDays(2)), // already expired
                new Members(5, "Aman", LocalDate.now().plusDays(30))
        );
		
		LocalDate today = LocalDate.now();
		LocalDate next30Days = today.plusDays(30);
		
		//expiry between today and next 30 days
		List<Members> expiringSoon = members.stream()
				.filter(m-> !m.getExpiryDate().isBefore(today)) //not expired 
				.filter(m -> !m.getExpiryDate().isAfter(next30Days)) //within 30 days
				.collect(Collectors.toList());
		
		System.out.println("Members expiring within 30 days");
		expiringSoon.forEach(System.out::println);
	}
}
