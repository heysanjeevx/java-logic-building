// Section 2.2 | Q184
import java.util.Scanner;

public class Question184 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a student marks(0 to 100): ");
        int marks = sc.nextInt();
        System.out.print("Enter their family annual income: ");
        int income = sc.nextInt();

        if (marks >= 90 && income < 200000) {
            System.out.println("Eligible to scholarship");
        } else {
            System.out.println("Not eligible to scholarship");
        }

        sc.close();
    }
}
