// Section 2.3 | Q207
import java.util.Scanner;

public class Question207 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your CIBIL score (300 to 900): ");
        int score = sc.nextInt();

        if (score < 300 || score > 900) {
            System.out.println("Invalid CIBIL Score");
        } else if (score >= 750) {
            System.out.println("Excellent - Loan easily approved");
        } else if (score >= 650) {
            System.out.println("Good - Loan likely approved");
        } else if (score >= 550) {
            System.out.println("Fair - Loan may be approved with conditions");
        } else {
            System.out.println("Poor - Loan likely rejected");
        }

        sc.close();
    }
}
