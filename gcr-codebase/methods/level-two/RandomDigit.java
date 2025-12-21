import java.util.*;
public class RandomDigit{
	public int [] generate4DigitRandomArray(int size){
		int [] randomDigitArray = new int[size];
		for(int i =0; i<size; i++){
			randomDigitArray[i] = (int)(Math.random()*9000) +1000;
		}
		return randomDigitArray;
		
	}
	public double[] findAverageMinMax(int [] numbers){
		
		double averageMinMax [] = new double[3];
		int sum =0; 
		averageMinMax[1]= Integer.MAX_VALUE;
		averageMinMax[2]=Integer.MIN_VALUE;
		for(int i =0; i<numbers.length;i++){
			sum+=numbers[i];
			averageMinMax[1] = Math.min(averageMinMax[1],numbers[i]);
			averageMinMax[2] = Math.max(averageMinMax[2], numbers[i]);
		}
		averageMinMax[0]= (double)sum/numbers.length;
		return averageMinMax;
		
	}
	
	public static void main(String [] args){
		RandomDigit obj = new RandomDigit();
		int [] randomDigitArray = obj.generate4DigitRandomArray(5);
		System.out.println(Arrays.toString(randomDigitArray));
		double[] averageMinMax = obj.findAverageMinMax(randomDigitArray);
		System.out.println("Average : " + averageMinMax[0] + " Min :" + averageMinMax[1] + " Max : " +averageMinMax[2]);
		
	}
}