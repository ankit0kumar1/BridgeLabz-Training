import java.util.Scanner;
public class MatrixCalculator {
    // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10); // random 0–9
            }
        }
        return matrix;
    }
    // Method to add two matrices
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }
    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }
    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = B[0].length;
        int common = B.length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }
    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter rows and columns of matrices: ");
        int rows = input.nextInt();
        int cols = input.nextInt();

        int[][] matrixA = createRandomMatrix(rows, cols);
        int[][] matrixB = createRandomMatrix(rows, cols);

		//print matix one
        System.out.println("\nMatrix A:");
        displayMatrix(matrixA);
		// print matrix second
        System.out.println("\nMatrix B:");
        displayMatrix(matrixB);
		// print addition of matrices
        System.out.println("\nAddition (A + B):");
        displayMatrix(addMatrices(matrixA, matrixB));
		// print subtraction of matrices
        System.out.println("\nSubtraction (A - B):");
        displayMatrix(subtractMatrices(matrixA, matrixB));
		// print multiplyMatrices
        System.out.println("\nMultiplication (A * B):");
        displayMatrix(multiplyMatrices(matrixA, matrixB));
		input.close();
    }
}