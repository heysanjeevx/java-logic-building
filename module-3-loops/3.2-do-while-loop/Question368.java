// Section 3.2 | Q368
import java.util.Scanner;

public class Question368 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer (N): ");
        int n = sc.nextInt();

        // Initialize reversed variable
        int reversed = 0;
        do {
            int digit = n % 10; // Extract last digit
            reversed = reversed * 10 + digit; // Build reversed number
            n = n / 10; // Remove last digit
        } while (n > 0);

        System.out.println(reversed);

        sc.close();
    }
}
