import java.util.Scanner;
public class StudentResult {
    //method to generate random PCM  marks 
    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3]; 
        for (int i = 0; i < students; i++) {
            scores[i][0] = (int) (Math.random() * 90) + 10; 
            scores[i][1] = (int) (Math.random() * 90) + 10; 
            scores[i][2] = (int) (Math.random() * 90) + 10; 
        }
        return scores;
    }
    // method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {
        int students = scores.length;
        double[][] result = new double[students][3]; 
        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            result[i][0] = Math.round(total * 100.0) / 100.0;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }
    // Method to display the scorecard
    public static void displayScoreCard(int[][] scores, double[][] result) {
        System.out.println("Stu\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        System.out.println("-------------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                scores[i][0] + "\t" +
                scores[i][1] + "\t\t" +
                scores[i][2] + "\t" +
                result[i][0] + "\t" +
                result[i][1] + "\t" +
                result[i][2]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] pcmScores = generateScores(students);
        double[][] results = calculateResults(pcmScores);
        displayScoreCard(pcmScores, results);
    }
}