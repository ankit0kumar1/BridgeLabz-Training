import java.util.*;
public class EmployeeBonus{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		
		double currentSalary [] = new double [10];
		double yearsOfService [] = new double[10];
		double newSalary [] = new double[10];
		double bonus [] = new double[10];
		
		//Taking inputs form the user
		for(int i =0; i<10 ; i++){
			System.out.print("Enter the salary of employee" + (i+1) + ": " );
			double valueSalary = input.nextDouble();
			System.out.print("Enter the years of service of employee" + (i+1) + ": " );
			double valueService = input.nextDouble();
			if(valueSalary< 0 || valueService< 0){
				System.out.println("Enter a valid Salary or Years of experience.");
				i--;
			}else{
				currentSalary[i] = valueSalary;
				yearsOfService[i] = valueService;
			}
			
			
		}
		double totalBonus =0;
		double totalSalary =0;
		double totalNewSalary =0;
		for(int i =0 ; i < 10 ; i++){
			if(yearsOfService[i]>= 5){
				bonus[i]= currentSalary[i]*0.05;
				
			}else{
				bonus[i] = currentSalary[i]*0.02;
				
			}
			newSalary[i]= bonus[i]+currentSalary[i];
			totalBonus +=bonus[i];
			totalSalary += currentSalary[i];
			totalNewSalary += newSalary[i]; 
		}
		
		//display the totalBonus, totalNewSalary , total oldSalary
		System.out.println("The total bonus received by 10 employees is: " + totalBonus);
		System.out.println("The total new salary received by 10 employees is: " + totalNewSalary);
		System.out.println("The total old salary received by 10 employees is: " + totalSalary);
		
		
		
		input.close();
		
	}
}