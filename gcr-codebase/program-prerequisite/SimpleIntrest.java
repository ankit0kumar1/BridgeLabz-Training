import java.util.Scanner;
class SimpleIntrest{
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Principal Amount: ");
		double principalamount = sc.nextDouble();
		System.out.print("Enter Rate of Interest: ");
		double rate = sc.nextDouble();
		System.out.print("Enter Time(in years): ");
		double time = sc.nextDouble();
		double simpleIntrest = (principalamount * rate * time )/100;
		System.out.println("Simple Interest:" + simpleIntrest);
	}
}