import java.util.Scanner;
public class TemperatureConverter {
    //method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    //method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static void main(String[] args) {
		
		//create a method that 
        Scanner input = new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.println("1. celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to celsius");
        System.out.print("enter your choice (1 or 2): ");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = input.nextDouble();
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.println(celsius + "°C = " + fahrenheit + "°F");
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = input.nextDouble();
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.println(fahrenheit + "°F = " + celsius + "°C");
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        input.close();
    }
}