import java.util.Scanner;
public class MultiDimensionalArray{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		//get numbers of rows and columns form the user
		System.out.print("Enter the numbers of row: ");
		int row = input.nextInt();
		System.out.print("Enter the numbers of columns: ");
		int column = input.nextInt();
		
		//get user input for the 2d array
		int twoDArray [][] = new int [row][column];
		System.out.print("Enter the elements of the 2d array: ");
		for(int i =0; i < row; i++){
			for(int j =0; j<column; j++){
				twoDArray [i][j] = input.nextInt();
			}
		}
		
		int oneDArray [] = new int[row*column];
		int index =0;
		for(int i =0; i < row; i++){
			for(int j =0; j<column; j++){
				oneDArray[index++]= twoDArray[i][j];
			}
		}
		
			for(int i =0; i < oneDArray.length; i++){
			System.out.print(oneDArray[i] + " ");
		}
		
		
		
		
		
		input.close();
	}
}