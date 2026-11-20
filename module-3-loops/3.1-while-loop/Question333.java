// Section 3.1 | Q333
import java.util.Scanner;

public class Question333 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        // Initialize count variable
        int count = 0;
        while (n > 0) {
            int digit = n % 10; // Extract digit
            if (digit % 2 == 0) { // Check digit are even
                count++; // Increment count by 1
            }
            n = n / 10; // Remove last digit
        }
        System.out.println("Count = " + count);

        sc.close();
    }
}
