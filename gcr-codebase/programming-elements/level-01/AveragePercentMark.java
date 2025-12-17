/*
Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
I/P => NONE
O/P => Sam’s average mark in PCM is ___
*/
class AveragePercentMark{
	public static void main(String [] args){
		int mathsMarks = 94, physicsMarks =95, chemistryMarks = 96;
		double average = (mathsMarks+ physicsMarks + chemistryMarks)/(double)3;
		System.out.println ("Sam's average mark in PCM is: " + average);
	}
}
