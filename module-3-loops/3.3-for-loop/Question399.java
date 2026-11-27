// Section 3.3 | Q399
import java.util.Scanner;

public class Question399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a positive integer (N): ");
        int n = sc.nextInt();

        // Initialize first and second variable
        int first = 0;
        int second = 1;

        // Print Fibonacci series up to N terms
        for (int i = 0; i < n; i++) {
            System.out.print(first + " "); // Print current number
            int next = first + second; // Add first and second value in next
            first = second; // Assign second value in first
            second = next; // Assign next value in second
        }

        sc.close();
    }
}
