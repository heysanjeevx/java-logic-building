// Section 3.1 | Q338
import java.util.Scanner;

public class Question338 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer (N): ");
        int n = sc.nextInt();

        // Initialize reverse variable
        int reversed = 0;
        while (n > 0) {
            int digit = n % 10; // Extract last digit
            reversed = reversed * 10 + digit; // Store digit in reverse
            n = n / 10; // Remove last digit
        }
        System.out.println("Reversed digits: " + reversed);

        sc.close();
    }
}
