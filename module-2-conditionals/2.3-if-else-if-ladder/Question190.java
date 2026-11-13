// Section 2.3 | Q190
import java.util.Scanner;

public class Question190 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter test score(0 to 10): ");
        int score = sc.nextInt();

        if (score < 0 || score > 10) {
            System.out.println("Invalid score");
        } else if (score == 10) {
            System.out.println("Perfect");
        } else if (score >= 8) {
            System.out.println("Excellent");
        } else if (score >= 6) {
            System.out.println("Good");
        } else if (score >= 4) {
            System.out.println("Average");
        } else {
            System.out.println("Poor");
        }

        sc.close();
    }
}
