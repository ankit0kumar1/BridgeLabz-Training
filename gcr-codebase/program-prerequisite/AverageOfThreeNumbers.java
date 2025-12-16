import java.util.Scanner;
class AverageOfThreeNumbers{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int number1 = sc.nextInt();
		System.out.print("Enter the second number: ");
		int number2 = sc.nextInt();
		System.out.print("Enter the third number: ");
		int number3 = sc.nextInt();
		System.out.print ("Average of the three numbers is: " + ((number1 + number2 +number3)/3));
	}
}