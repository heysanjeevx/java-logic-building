// Section 3.2 | Q367
import java.util.Scanner;

public class Question367 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer (N): ");
        int n = sc.nextInt();
        // Initialize counter variable and sum
        int i = 1;
        int sum = 0;

        // Print total sum from 1 to N
        do {
            sum = sum + i; // Add i to sum
            i++; // Increment counter by 1
        } while (i <= n);
        System.out.println("Total sum = " + sum);

        sc.close();
    }
}
