// Section 2.2 | Q166
import java.util.Scanner;

public class Question166 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a student marks(0 to 100): ");
        int marks = sc.nextInt();

        if (marks >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
