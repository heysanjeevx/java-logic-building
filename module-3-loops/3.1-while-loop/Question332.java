// Section 3.1 | Q332
import java.util.Scanner;

public class Question332 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer (N): ");
        int n = sc.nextInt();

        // Initialize factorial and counter variable
        long fact = 1;
        int i = 1;

        // Loop from 1 to N to find factorial
        while (i <= n) {
            fact = fact * i; // Calculate factorial
            i++; // Increment counter by 1
        }
        // Print the final output
        System.out.println("Factorial = " + fact);

        sc.close();
    }
}
