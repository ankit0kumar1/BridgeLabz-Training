import java.util.Scanner;

public class UnitConverter {

    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		
		//Taking input from the user
        System.out.print("Enter distance in kilometers: ");
        double kilometers = input.nextDouble();

        System.out.print("Enter distance in miles: ");
        double miles = input.nextDouble();

        System.out.print("Enter distance in meters: ");
        double meters = input.nextDouble();

        System.out.print("Enter distance in feet: ");
        double feet = input.nextDouble();
		
		//displaying the results
        System.out.println(kilometers + " km = " + convertKmToMiles(kilometers) + " miles");
        System.out.println(miles + " miles = " + convertMilesToKm(miles) + " km");
        System.out.println(meters + " meters = " + convertMetersToFeet(meters) + " feet");
        System.out.println(feet + " feet = " + convertFeetToMeters(feet) + " meters");

        input.close();
    }
}
