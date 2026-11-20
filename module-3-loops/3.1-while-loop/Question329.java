// Section 3.1 | Q329
import java.util.Scanner;

public class Question329 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number (N): ");
        int n = sc.nextInt();

        // Initialize sum and counter variable
        int sum = 0;
        int i = 1;

        // Loop from 1 to N to find even numbers
        while (i <= n) {
            if (i % 2 == 0) {
                sum = sum + i; // Add even number to sum
            }
            i++; // Increment counter by 1
        }
        // Print the final output
        System.out.println("Sum of even number: " + sum);

        sc.close();
    }
}
