import java.util.*;
public class BMIVersionTwo{
	public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		
		//Taking input form the user
		System.out.print("Enter the number of person for BMI: ");
		int numberOfPersons = input.nextInt();
		
		double persondata [][] = new double[numberOfPersons][2];
		
		double bmi [] = new double[numberOfPersons];
		String weightStatus[] = new String[numberOfPersons];
		
		for(int i =0; i<numberOfPersons; i++){
			for(int j =0; j<2; j++){
				System.out.print("Enter the weight and height of person"+ (i+1) +": ");
				persondata[i][j] = input.nextDouble();
			}
		}
		
		for(int i =0; i <numberOfPersons;i++){
		
			for(int j =0 ; j<2; j++){
				bmi[i]= persondata[i][0]/(persondata[i][1]*persondata[i][1]);
				if(bmi[i]>=40){
				weightStatus[i] = "Obese";
				}else if(bmi[i]>25){
				weightStatus[i]= "Overweight";
				}else if(bmi[i]>18.5){
				weightStatus[i] = "Normal";
				}else{
				weightStatus[i] = "Underweight";
				}
			}
			

		}
		
		//displaying the output
		for(int i =0; i <numberOfPersons;i++){
			System.out.println("Weight: " + persondata[i][0] + " Height: " + persondata[i][1] + " BMI: " + bmi[i] + " WeightStatus: " + weightStatus[i] );
		}
		
	}

}	