// Section 3.1 | Q336
import java.util.Scanner;

public class Question336 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer (N): ");
        int n = sc.nextInt();

        // Initialize sum variable
        int sum = 0;
        while (n > 0) {
            int digit = n % 10; // Extract last digit
            sum = sum + digit; // Add last digit in sum
            n = n / 10; // Remove last digit
        }
        System.out.println("Sum of digits : " + sum);

        sc.close();
    }
}
