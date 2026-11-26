// Section 3.3 | Q396
import java.util.Scanner;

public class Question396 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a positive integer (N): ");
        int n = sc.nextInt();

        // Print all squares number from 1 to N
        for (int i = 1; i <= n; i++) {
            int square = i * i; // Build square number
            System.out.print(square + " "); // Print current square number
        }

        sc.close();
    }
}
