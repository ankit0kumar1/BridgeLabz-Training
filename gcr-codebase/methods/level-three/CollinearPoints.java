import java.util.Scanner;
public class CollinearPoints {
    // Method using slope formula
    public static boolean isCollinearUsingSlope(
            int x1, int y1, int x2, int y2, int x3, int y3) {
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1)
            && (y2 - y1) * (x3 - x1) == (y3 - y1) * (x2 - x1);
    }
    //Method using area of triangle formula
    public static boolean isCollinearUsingArea(
            int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (
                x1 * (y2 - y3) +
                x2 * (y3 - y1) +
                x3 * (y1 - y2)
        );
        return area == 0;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // input points
        System.out.print("Enter x1 y1: ");
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        System.out.print("Enter x2 y2: ");
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        System.out.print("Enter x3 y3: ");
        int x3 = input.nextInt();
        int y3 = input.nextInt();
        // Check using slope
        if (isCollinearUsingSlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are collinear using slope method.");
        } else {
            System.out.println("points are not collinear using slope method.");
        }

        // Check using area and print result
        if (isCollinearUsingArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are collinear using area method.");
        } else {
            System.out.println("Points are not collinear using area method.");
        }
		
    }
}