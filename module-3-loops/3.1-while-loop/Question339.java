// Section 3.1 | Q339
import java.util.Scanner;

public class Question339 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer (N): ");
        int n = sc.nextInt();

        // Store original number before modifying n and Initialize reversed
        int original = n;
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10; // Extract last digit
            reversed = reversed * 10 + digit; // Build reversed number
            n = n / 10; // Remove last digit
        }

        // Compare original and reversed numbers
        if (original == reversed) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

        sc.close();
    }
}
