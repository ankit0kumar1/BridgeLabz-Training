import java.util.*;
public class WindChillTemperature{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		//Get temperature and wind speed form the user 
		System.out.print("Enter the temperature : " );
		double temperature = input.nextDouble();
		System.out.print("Enter the wind speed : ");
		double windSpeed = input.nextDouble();
		
		
		//Displaying the output 
		WindChillTemperature obj = new WindChillTemperature();
		double result = obj.calculateWindChill(temperature, windSpeed);
		System.out.println("The wind chill is : " + result);
		input.close();
	}
	public double calculateWindChill(double temperature, double windSpeed){
		double windChill = 35.74 + 0.6215 *temperature + (0.4275*temperature - 35.75) * Math.pow(windSpeed,0.16);
		return windChill;
	}
}