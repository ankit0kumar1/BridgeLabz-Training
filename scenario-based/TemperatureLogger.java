/*
11. Temperature Logger 🌡️
Record temperatures over 7 days.
● Use array and for-loop.
● Find average and max temperature.
● Use if for comparisons. Maintain readable naming and modular code blocks.
*/
import java.util.*;
public class TemperatureLogger{
	public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		// Array for temperature
		double temperature[] = new double[7];
		
		double sum =0;
		for(int i =0; i < temperature.length; i++){
			System.out.print("Day " + (i+1) + " temperature: ");
			temperature[i] = input.nextDouble();
			sum += temperature[i];
		}
		System.out.println("+---------+-----------------+");
		System.out.printf("| %-10s | %-12s | %n", "Day" , "Temperature");
		for(int i =0; i < temperature.length;i++){
			System.out.printf("| %-10s | %-12s | %n", "Day"+(i+1) , temperature[i]);
		}
		System.out.println("+---------+-----------------+");
		
		System.out.println("Average temperature of 7 days is : " + (sum/7.0));
		double max = Integer.MIN_VALUE;
		for(double element : temperature){
			if(max< element){
				max= element;
			}
			
		}
		System.out.println("Maximum temperature in 7 days is : "+ max);
		
		
	}
}