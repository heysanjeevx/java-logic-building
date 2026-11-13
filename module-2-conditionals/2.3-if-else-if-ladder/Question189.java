// Section 2.3 | Q189
import java.util.Scanner;

public class Question189 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter percentage(0 to 100): ");
        double percentage = sc.nextDouble();

        if (percentage < 0 || percentage > 100) {
            System.out.println("Invalid percentage");
        } else if (percentage >= 90) {
            System.out.println("Excellent");
        } else if (percentage >= 80) {
            System.out.println("Very Good");
        } else if (percentage >= 70) {
            System.out.println("Good");
        } else if (percentage >= 60) {
            System.out.println("Average");
        } else {
            System.out.println("Needs Improvement");
        }

        sc.close();
    }
}
