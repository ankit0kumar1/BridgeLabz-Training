import java.util.Scanner;
class AreaOfCircle{
	public static void main(String[] args ){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of a circle to get area: ");
		double radius = sc.nextDouble();
		
		double area = Math.PI*radius*radius;
		System.out.println("The area of the circle is: "+ area);
		
	}
}