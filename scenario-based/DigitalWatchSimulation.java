/*
16. Digital Watch Simulation ⏱️
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements
*/
import java.util.*;
public class DigitalWatchSimulation{
	public static void main(String [] args){
		for(int i =0; i<24;i++ ){
			for(int j =0; j<60; j++){
				System.out.printf("%02d:%02d%n",i,j);
			
				if(i==13) System.exit(0);
			}
		}
	}
}