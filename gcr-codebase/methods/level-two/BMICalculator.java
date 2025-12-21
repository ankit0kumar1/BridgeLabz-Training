import java.util.*;

public class BMICalculator {

    // Method to calculate BMI 
    public static void calculateBMI(double[][] persondata) {
        for (int i = 0; i < persondata.length; i++) {
            double weight = persondata[i][0];
            double heightInCm = persondata[i][1];
            double heightInMeter = heightInCm / 100;

            persondata[i][2] = weight / (heightInMeter * heightInMeter);
        }
    }

    // Method to determine BMI status
    public static String[] getBMIStatus(double[][] persondata) {
        String[] weightStatus = new String[persondata.length];

        for (int i = 0; i < persondata.length; i++) {
            double bmi = persondata[i][2];

            if (bmi >= 40) {
                weightStatus[i] = "Obese";
            } else if (bmi > 25) {
                weightStatus[i] = "Overweight";
            } else if (bmi > 18.5) {
                weightStatus[i] = "Normal";
            } else {
                weightStatus[i] = "Underweight";
            }
        }
        return weightStatus;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfPersons = 10;

        // 10 rows and 3 columns (weight, height, BMI)
        double persondata[][] = new double[numberOfPersons][3];

        // Taking input from the user
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.print("Enter the weight (kg) of person " + (i + 1) + ": ");
            persondata[i][0] = input.nextDouble();

            System.out.print("Enter the height (cm) of person " + (i + 1) + ": ");
            persondata[i][1] = input.nextDouble();
        }

        // Method calls
        calculateBMI(persondata);
        String[] weightStatus = getBMIStatus(persondata);

        // Displaying the output
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println(
                "Weight: " + persondata[i][0] +
                " Height: " + persondata[i][1] +
                " BMI: " + persondata[i][2] +
                " WeightStatus: " + weightStatus[i]
            );
        }

        input.close();
    }
}
