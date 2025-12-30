/*
13. Sandeep’s Fitness Challenge Tracker 🏋️
♂Each day Sandeep completes a number of push-ups.
● Store counts for a week.
● Use for-each to calculate total and average.
● Use continue to skip rest days.
*/

import java.util.*;
public class FitnessTracker{
	public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		// Array for pushups
		int pushups[] = new int[7];
		
		
		for(int i =0; i < pushups.length; i++){
			System.out.print("Day " + (i+1) + " Push-ups: ");
			pushups[i] = input.nextInt();
			
		}
		System.out.println("+---------+-----------------+");
		System.out.printf("| %-10s | %-12s | %n", "Day" , "Push-ups");
		for(int i =0; i < pushups.length;i++){
			if(pushups[i]==0 || pushups[i] == -1){
				System.out.printf("| %-10s | %-12s | %n", "Day"+(i+1) , "Rest");
			}else{
				System.out.printf("| %-10s | %-12s | %n", "Day"+(i+1) , pushups[i]);
			}
		}
		System.out.println("+---------+-----------------+");
		
		int sum=0;
		int avg=0;
		int count =1;
		
		//average and total using for-each loop 
		for(int element : pushups){
			if(element==0 ||element== -1 ){
				
				continue;
			}else{
			sum+= element;
			avg = sum/ count;
			count++;
			}
		}
		System.out.println("Total push-ups of 7 days is : " + sum );
		System.out.println("Average push-ups of 7 days is : " + avg );
		
		
		
	}
}