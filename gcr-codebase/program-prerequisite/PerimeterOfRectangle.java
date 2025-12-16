import java.util.Scanner;
class PerimeterOfRectangle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length of the Rectangle: ");
		double length = sc.nextDouble();
		System.out.print("Enter width of the Rectangle: ");
		double width = sc.nextDouble();
		System.out.println("Perimeter Of Rectangle is: " +(2*(length+width)));
	}
}