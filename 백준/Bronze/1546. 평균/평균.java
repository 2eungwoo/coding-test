import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] scores = new int[n];
        int MAX = 0; 

        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt(); 
            if (scores[i] > MAX) {
                MAX = scores[i]; 
            }
        }
        
        double sumNewScores = 0.0;
        for (int s : scores) {
            double newScore = (double) s / MAX * 100;
            sumNewScores += newScore;
        }
        
        System.out.println(sumNewScores / n);
    }
}