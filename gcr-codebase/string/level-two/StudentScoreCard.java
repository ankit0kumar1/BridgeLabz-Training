import java.util.Scanner;
public class StudentScoreCard {
    //generate random 2-digit PCM scores
    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int) (Math.random() * 90) + 10; 
            }
        }
        return scores;
    }
    //method that calculate total, average, percentage
    public static double[][] calculateResults(int[][] scores) {
        int students = scores.length;
        double[][] results = new double[students][3];
        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }
    //calculate grade
    public static String[] calculateGrades(double[][] results) {
        int students = results.length;
        String[] grades = new String[students];
        for (int i = 0; i < students; i++) {
            double percentage = results[i][2];
            if (percentage >= 90) grades[i] = "A+";
            else if (percentage >= 80) grades[i] = "A";
            else if (percentage >= 70) grades[i] = "B";
            else if (percentage >= 60) grades[i] = "C";
            else if (percentage >= 50) grades[i] = "D";
            else grades[i] = "F";
        }
        return grades;
    }
    //print scorecard
    public static void displayScoreCard(int[][] scores, double[][] results, String[] grades) {
        System.out.println("\nScorecard:");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.0f\t%.2f\t%.2f\t\t%s%n",
                    (i + 1),
                    scores[i][0],
                    scores[i][1],
                    scores[i][2],
                    results[i][0],
                    results[i][1],
                    results[i][2],
                    grades[i]);
        }
    }
    public static void main(String[] args) {
		
		//create scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = input.nextInt();
        int[][] scores = generateScores(students);
        double[][] results = calculateResults(scores);
        String[] grades = calculateGrades(results);
		
		//display scorecard
        displayScoreCard(scores, results, grades);
        input.close();
    }
}