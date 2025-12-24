import java.util.Scanner;
public class BMI{
    //calculate BMI and Status for one person
    public static String[] calculateBMI(double weight, double heightCm) {
        double heightMeter = heightCm / 100.0;
        double bmi = weight / (heightMeter * heightMeter);
        //Round BMI 
        bmi = Math.round(bmi * 100.0) / 100.0;
        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        return new String[] {
            String.valueOf(heightCm),
            String.valueOf(weight),
            String.valueOf(bmi),
            status
        };
    }
    //process all persons and store results
    public static String[][] processBMI(double[][] data) {
        String[][] result = new String[10][4];
        for (int i = 0; i < 10; i++) {
            result[i] = calculateBMI(data[i][0], data[i][1]);
        }
        return result;
    }
    //display BMI Table
    public static void displayResult(String[][] result) {

        System.out.println("\nBMI Report:");
        System.out.println("Person\tHeight(cm)\tWeight(kg)\tBMI\tStatus");

        for (int i = 0; i < result.length; i++) {
            System.out.printf("%d\t%s\t\t%s\t\t%s\t%s%n",
                    (i + 1),
                    result[i][0],
                    result[i][1],
                    result[i][2],
                    result[i][3]);
        }
    }
    public static void main(String[] args) {
	
		//Create scanner object
        Scanner input = new Scanner(System.in);
        double[][] data = new double[10][2];
        // Input weight and height
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));
            System.out.print("Weight (kg): ");
            data[i][0] = input.nextDouble();
            System.out.print("Height (cm): ");
            data[i][1] = input.nextDouble();
        }
		
		//print result
        String[][] bmiResult = processBMI(data);
        displayResult(bmiResult);
        input.close();
    }
}