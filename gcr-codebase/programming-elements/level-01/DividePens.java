public class DividePens{
	public static void main (String [] args){
		int numbersOfPens =14;
		int numbersOfStudents =3;
		int numbersOfPensIndividualGot = numbersOfPens/numbersOfStudents;
		int remainingPens = numbersOfPens%numbersOfStudents;
		System.out.println("The Pen Per Student is " + numbersOfPensIndividualGot + " and the remaining pen not distributed is " +remainingPens);
	}
}