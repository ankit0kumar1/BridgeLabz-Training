package com.streamapi.insuranceclaim;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		 List<Claim> claims = Arrays.asList(
	                new Claim(101, "Health", 12000),
	                new Claim(102, "Car", 25000),
	                new Claim(103, "Health", 18000),
	                new Claim(104, "Home", 30000),
	                new Claim(105, "Car", 15000),
	                new Claim(106, "Health", 10000),
	                new Claim(107, "Home", 50000)
	        );
		 	
		 Map<String , Double> avgAmtByType = claims.stream()
				 .collect(Collectors.groupingBy(Claim:: getClaimType,
						 Collectors.averagingDouble(Claim::getAmount)));
		 System.out.println(avgAmtByType);
		 
	}
}
