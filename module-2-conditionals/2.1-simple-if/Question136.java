// Section 2.1 | Q136
import java.util.Scanner;

public class Question136 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the student marks(0 to 100): ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Distinction");
        }
    }
}
