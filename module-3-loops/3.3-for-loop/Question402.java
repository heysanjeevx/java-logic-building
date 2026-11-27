// Section 3.3 | Q402
import java.util.Scanner;

public class Question402 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a positive integer (N): ");
        int n = sc.nextInt();

        // Initialize sum variable
        int sum = 0;

        // Run Loop from 2 to N
        for (int i = 2; i <= n; i += 2) {
            sum = sum + i; // Add i to sum
        }

        // Print final output
        System.out.println("Total even sum = " + sum);
    }
}
