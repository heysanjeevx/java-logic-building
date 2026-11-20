// Section 3.1 | Q331
import java.util.Scanner;

public class Question331 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer (N): ");
        int n = sc.nextInt();

        // Initialize sum and counter variable
        int sum = 0;
        int i = 1;

        // Loop from 1 to N to find squares
        while (i <= n) {
            int square = i * i; // Calculate square
            sum = sum + square; // Add square number to sum
            i++; // Increment counter by 1
        }
        // Print the final output
        System.out.println("Sum of squares: " + sum);

        sc.close();
    }
}
