// Section 3.3 | Q403
import java.util.Scanner;

public class Question403 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a positive integer (N): ");
        int n = sc.nextInt();

        // Initialize sum variable
        int sum = 0;

        // Run loops from 1 to N
        for (int i = 1; i <= n; i += 2) {
            sum = sum + i;
        }
        // Print the final output
        System.out.println("Total odd number: " + sum);
    }
}
