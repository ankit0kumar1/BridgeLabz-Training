import java.util.Scanner;

public class UnitConverterV2 {
	// Temperature conversions
    public static double convertFarhenheitToCelsius(double farhenheit){
        return (farhenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFarhenheit(double celsius){
        return (celsius * 9 / 5) + 32;
    }

    // Weight conversions
    public static double convertPoundsToKilograms(double pounds){
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms){
        return kilograms * 2.20462;
    }

    // Volume conversions
    public static double convertGallonsToLiters(double gallons){
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters){
        return liters * 0.264172;
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double farhenheit = input.nextDouble();

        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();

        System.out.print("Enter weight in kilograms: ");
        double kilograms = input.nextDouble();

        System.out.print("Enter volume in gallons: ");
        double gallons = input.nextDouble();

        System.out.print("Enter volume in liters: ");
        double liters = input.nextDouble();

        System.out.println(farhenheit + " °F = " +
                convertFarhenheitToCelsius(farhenheit) + " °C");

        System.out.println(celsius + " °C = " +
                convertCelsiusToFarhenheit(celsius) + " °F");

        System.out.println(pounds + " pounds = " +
                convertPoundsToKilograms(pounds) + " kilograms");

        System.out.println(kilograms + " kilograms = " +
                convertKilogramsToPounds(kilograms) + " pounds");

        System.out.println(gallons + " gallons = " +
                convertGallonsToLiters(gallons) + " liters");

        System.out.println(liters + " liters = " +
                convertLitersToGallons(liters) + " gallons");

        input.close();
    }
}
