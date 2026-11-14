// Section 2.3 | Q194
import java.util.Scanner;

public class Question194 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your IQ score: ");
        int iqScore = sc.nextInt();

        if (iqScore >= 145) {
            System.out.println("Genius");
        } else if (iqScore >= 130) {
            System.out.println("Highly Gifted");
        } else if (iqScore >= 115) {
            System.out.println("Above Average");
        } else if (iqScore >= 85) {
            System.out.println("Average");
        } else {
            System.out.println("Below Average");
        }

        sc.close();
    }
}
