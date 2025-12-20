import java.util.*;
public class BMI{
	public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		
		//Taking input form the user
		System.out.print("Enter the number of person for BMI: ");
		int numberOfPersons = input.nextInt();
		
		double weight [] = new double[numberOfPersons];
		double height [] = new double[numberOfPersons];
		double bmi [] = new double[numberOfPersons];
		String weightStatus[] = new String[numberOfPersons];
		
		for(int i =0; i<numberOfPersons; i++){
			
			System.out.print("Enter the weight of person"+ (i+1) +": ");
			weight[i] = input.nextDouble();
			System.out.print("Enter the height of person"+ (i+1) +": ");
			height[i] = input.nextDouble();
		}
		
		for(int i =0; i <numberOfPersons;i++){
			bmi[i]= weight[i]/(height[i]*height[i]);
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
		
		//displaying the output
		for(int i =0; i <numberOfPersons;i++){
			System.out.println("Weight: " + weight[i] + " Height: " + height[i] + " BMI: " + bmi[i] + " WeightStatus: " + weightStatus[i] );
		}
		
	}

}	