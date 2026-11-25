// Section 3.2 | Q378
import java.util.Scanner;

public class Question378 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number (N): ");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;

        do {
            int digit = n % 10; // Extract Digit
            sum = sum + (digit * digit * digit); // Add cube of digit to sum
            n = n / 10; // Remove last digit
        } while (n > 0);

        if (original == sum) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not Armstrong number");
        }

        sc.close();
    }
}
