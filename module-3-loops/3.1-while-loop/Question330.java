// Section 3.1 | Q330
import java.util.Scanner;

public class Question330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number (N): ");
        int n = sc.nextInt();

        // Initialize sum and counter variable
        int sum = 0;
        int i = 1;

        // Loop from 1 to N to find odd numbers
        while (i <= n) {
            sum = sum + i;
            i += 2; // Increment counter by 2
        }
        // Print the final output
        System.out.println("Sum of odd : " + sum);

        sc.close();
    }
}
