// Section 3.1 | Q334
import java.util.Scanner;

public class Question334 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer (N): ");
        int n = sc.nextInt();

        // Initialize counter variable
        int count = 0;
        while (n > 0) {
            int digit = n % 10; // Extract last digit
            if (digit % 2 != 0) { // Check digit are ood
                count++; // Increment counter by 1
            }
            n = n / 10; // Remove last digit
        }
        System.out.println("Count = " + count);
    }
}