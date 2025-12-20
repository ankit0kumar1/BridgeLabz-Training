import java.util.Scanner;
public class GradeCalculatorMatrix{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//taking input form the user
		System.out.print("Enter the number of student: ");
		int numberOfStudent = input.nextInt();
		
		double marks[][] =new double[numberOfStudent][3]; 
		char grades[] = new char[numberOfStudent];
		
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
				marks[row][0] = value;
				break;
			}
			while(true){
				System.out.print("Enter the marks of Chemistry of "+(row+1)+"th person: ");
				value = input.nextDouble();
				if(value < 0){
					System.out.print("Enter valid number: ");
					continue;
				}
				marks[row][1] = value;
				break;
			}
			while(true){
				System.out.print("Enter the marks of Maths of "+(row+1)+"th person: ");
				value = input.nextDouble();
				if(value < 0){
					System.out.print("Enter valid number: ");
					continue;
				}
				marks[row][2] = value;	
				break;
			}		
		}
		// calculating grades 
		for(int row = 0; row < numberOfStudent; row++){
			double sum = marks[row][0] + marks[row][1] + marks[row][2];
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
			System.out.println("Marks of physics: " + marks[row][0] + ", chemistry : " + marks[row][1] + ", and maths is: " + marks[row][2] + " percentage is: "+ percentage[index]+", Grade: "+grades[index]);
			index++;
		}
		input.close();
		
	}
}