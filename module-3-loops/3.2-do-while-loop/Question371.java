// Section 3.2 | Q371
import java.util.Scanner;
public class Question371 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer (N): ");
        int n = sc.nextInt();

        // Save original number and initialize reversed variable
        int original = n;
        int reversed = 0;

        do {
            int digit = n % 10; // Extract last digit
            reversed = reversed * 10 + digit; // Build reversed number
            n = n / 10; // Remove last digit
        } while (n > 0);

        // Check if original and reversed numbers are equal
        if (original == reversed) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }

        sc.close();
    }
}
