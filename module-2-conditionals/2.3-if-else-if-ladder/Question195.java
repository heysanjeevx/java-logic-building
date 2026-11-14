// Section 2.3 | Q195
import java.util.Scanner;

public class Question195 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter percentage of marks: ");
        double percentage = sc.nextDouble();

        if (percentage < 0 || percentage > 100) {
            System.out.println("Invalid Percentage");
        } else if (percentage >= 95) {
            System.out.println("Full Scholarship");
        } else if (percentage >= 85) {
            System.out.println("50% Scholarship");
        } else if (percentage >= 75) {
            System.out.println("25% Scholarship");
        } else {
            System.out.println("No Scholarship");
        }

        sc.close();
    }
}
