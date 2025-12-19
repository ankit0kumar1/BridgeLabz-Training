import java.util.Scanner;
public class StoreNumbersAndSum{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		double array [] = new double[10];
		int index =0;
		int sum =0;
		
		//Taking input from the user
		while(true){
			System.out.print("Enter a number: ");
			double number = input.nextDouble();
			if(number == 0 || number < 0 || index == 10){
				break;
			}else{
				array[index]= number;
				index++;
			
			}	
		}
		for(int i =0; i<10 ; i++){
				sum += array[i];
			}
		System.out.println("The total value is: " + sum);
		input.close();
		
	}
}