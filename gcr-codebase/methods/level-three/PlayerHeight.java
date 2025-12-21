import java.util.*;
public class PlayerHeight{
	
	//Method for totalSum
	public static int findSum(int[] height){
		int sum =0;
		for(int element : height){
			sum +=element;
		}
		return sum;
	} 
	
	//method for mean height
	public static double calculateMeanHeight(int sum, int count){
		double avg = (double)sum/count;
		return avg;
	}
	
	//method for shortest height
	public static int findShortestHeight(int [] height){
		int shortest= height[0];
		
		for(int element : height){
			if(element<shortest){
				shortest = element;
			}
			
		}
		return shortest;
	}
	
	//method for tallest height
	public static int findTallestHeight(int [] height){
		int tallest = height[0];
		for(int element : height){
			if(element> tallest){
				tallest = element;
			}
		}
		return tallest;
	}
	
	//main method
	public static void main(String [] args){
		
		int height[] = new int [11];
		//initializing array with random values between 150-250.
		for(int i =0; i <11 ; i++){
			height[i] = (int)(Math.random()*(250-150+1))+150;
		}
		//get totalSum,mean,shortest height, tallest height
		int totalSum = findSum(height);
		double mean = calculateMeanHeight(totalSum,height.length);
		int shortest = findShortestHeight(height);
		int tallest = findTallestHeight(height);
		
		//output
		System.out.println("The sum of heights is: "+ totalSum);
		System.out.println("The mean of heights is: "+ mean);
		System.out.println("The smallest height is: "+ shortest);
		System.out.println("The tallest height is: " + tallest);
	}
}