import java.util.Scanner;

public class FactorsCalculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();
		
        int[] factors = getFactors(number);

		//Display factors
        System.out.println("Factors of " + number + ":");
        for (int factor : factors){
            System.out.print(factor + " ");
        }
        System.out.println();

        // Calling methods
        int sum = getSumOfFactors(factors);
        long product = getProductOfFactors(factors);
        double sumOfSquares = getSumOfSquaresOfFactors(factors);

        // Display results
        System.out.println("Sum of factors = " + sum);
        System.out.println("Product of factors = " + product);
        System.out.println("Sum of squares of factors = " + sumOfSquares);

        input.close();
    }

    // Method to find factors and return array
    static int[] getFactors(int number){

        int count = 0;
        for(int i = 1; i <= number; i++){
            if (number % i == 0){
                count++;
            }
        }

        int[] factors = new int[count];

        int index = 0;
        for(int i = 1; i <= number; i++){
            if (number % i == 0){
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // Method to find sum of factors
    static int getSumOfFactors(int[] factors){
        int sum = 0;
        for(int factor : factors){
            sum += factor;
        }
        return sum;
    }

    // Method to find product of factors
    static long getProductOfFactors(int[] factors){
        long product = 1;
        for(int factor : factors){
            product *= factor;
        }
        return product;
    }

    // Method to find sum of squares of factors
    static double getSumOfSquaresOfFactors(int[] factors) {
        double sum = 0;
        for (int factor : factors) {
            sum += Math.pow(factor, 2);
        }
        return sum;
    }
}
