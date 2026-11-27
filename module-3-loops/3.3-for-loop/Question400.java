// Section 3.3 | Q400
import java.util.Scanner;

public class Question400 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a positive integer (N): ");
        int n = sc.nextInt();

        // Loop through numbers from 2 to N
        for (int num = 2; num <= n; num++) {
            int count = 0; // Reset factor count for current number

            // Check if num has any factor from 2 to num-1
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    count++; // Increment count
                }
            }
            // Print num if no factors were found (Prime)
            if (count == 0) {
                System.out.print(num + " ");
            }
        }
        sc.close();
    }
}
