// Section 3.3 | Q401
import java.util.Scanner;

public class Question401 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a positive integer (N): ");
        int n = sc.nextInt();

        // Initialize sum variable
        int sum = 0;

        // Run loop from 1 to N
        for (int i = 1; i <= n; i++) {
            sum = sum + i; // Add i to sum
        }
        // Print the final output
        System.out.println("Total sum = " + sum);

        sc.close();
    }
}
