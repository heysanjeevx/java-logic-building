// Section 3.3 | Q391
import java.util.Scanner;

public class Question391 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a positive integer (N): ");
        int n = sc.nextInt();

        // Print numbers from 1 to N
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " "); // Print current number
        }
    }
}
