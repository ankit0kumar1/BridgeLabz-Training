import java.util.Scanner;
public class GradeCalculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//taking input form the user
		System.out.print("Enter the number of student: ");
		int numberOfStudent = input.nextInt();
		
		double [] physics = new double[numberOfStudent];
		double [] chemistry = new double[numberOfStudent];
		double [] maths = new double[numberOfStudent];
		double [] percentage = new double[numberOfStudent];
		char [] grades = new char[numberOfStudent];
		
		
		int index = 0;
		double value = 0.0;
		// Taking input for user and handling the negative case.
		for(int row = 0 ; row < numberOfStudent; row++){
			while(true){
				System.out.print("Enter the marks of Physics of "+(row+1)+"th person: ");
				value = input.nextDouble();
				if(value < 0){
					System.out.print("Enter valid number: ");
					continue;
				}
				physics[row] = value;
				break;
			}
			while(true){
				System.out.print("Enter the marks of Chemistry of "+(row+1)+"th person: ");
				value = input.nextDouble();
				if(value < 0){
					System.out.print("Enter valid number: ");
					continue;
				}
				chemistry[row] = value;
				break;
			}
			while(true){
				System.out.print("Enter the marks of Maths of "+(row+1)+"th person: ");
				value = input.nextDouble();
				if(value < 0){
					System.out.print("Enter valid number: ");
					continue;
				}
				maths[row] = value;	
				break;
			}		
		}
		// calculating grades 
		for(int row = 0; row < numberOfStudent; row++){
			double sum = physics[row] + chemistry[row] + maths[row];
			double tempPercentage = sum/3;
			percentage[index] = tempPercentage;
			if(tempPercentage >= 80){
				grades[index] = 'A';
			}
			else if(tempPercentage >= 70){
				grades[index] = 'B';
			}
			else if(tempPercentage >= 60){
				grades[index] = 'C';
			}
			else if(tempPercentage >= 50){
				grades[index] = 'D';
			}
			else if(tempPercentage >= 40){
				grades[index] = 'E';
			}
			else{
				grades[index] = 'R';
			}
			index++;
		}
		
		//displaying the output
		index = 0;
		for(int row = 0 ; row < numberOfStudent ; row++){
			System.out.println("Marks of physics: " + physics[row] + ", chemistry : " + chemistry[row] + ", and maths is: " + maths[row] + " percentage is: "+ percentage[index]+", Grade: "+grades[index]);
			index++;
		}
		input.close();
		
	}
}