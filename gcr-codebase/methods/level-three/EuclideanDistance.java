import java.util.Scanner;
public class EuclideanDistance {
    // Method to find Euclidean distance
    public static double findDistance(int x1, int y1, int x2, int y2) {
        double distance = Math.sqrt(
                Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
        );
        return distance;
    }
    //Method to find slope (m) and y-intercept (b)
    public static double[] findLineEquation(int x1, int y1, int x2, int y2) {
        double m = (double) (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;                   
        return new double[]{m, b};
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Input points
        System.out.print("Enter  x1 y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.print("enter x2 y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        // Distance calculation
        double distance = findDistance(x1, y1, x2, y2);
        System.out.println("Euclidean distance = " + distance);

        // Line equation calculation
        if (x1 == x2) {
            System.out.println("The line is vertical. Equation: x = " + x1);
        } else {
            double[] line = findLineEquation(x1, y1, x2, y2);
            System.out.println("Equation of line: y = " + line[0] + "x + " + line[1]);
        }
		
    }
}