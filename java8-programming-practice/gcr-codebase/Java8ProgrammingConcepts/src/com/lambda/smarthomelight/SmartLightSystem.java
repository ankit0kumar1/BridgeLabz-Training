package com.lambda.smarthomelight;

import java.util.Scanner;

public class SmartLightSystem {
	  public static void main(String[] args) {
		  	Scanner sc = new Scanner(System.in);
		  	
		  	System.out.println("Enter the trigger (Motion/Night/Voice party):");

	        String trigger = sc.next(); 

	        LightPattern pattern;
	        
	        if (trigger.equalsIgnoreCase("MOTION")) {
	            pattern = () -> System.out.println("Motion: Lights ON at 100%");
	        }
	        else if (trigger.equalsIgnoreCase("NIGHT")) {
	            pattern = () -> System.out.println("Night: Dim lights at 30%");
	        }
	        else if (trigger.equalsIgnoreCase("VOICE_PARTY")) {
	            pattern = () -> System.out.println("Party: RGB Disco lights ON");
	        }
	        else {
	            pattern = () -> System.out.println("Unknown trigger: No action");
	        }
	        
	        // execute lambda
	        pattern.activate();
	    }
}
