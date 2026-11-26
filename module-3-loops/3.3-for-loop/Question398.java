// Section 3.3 | Q398
import java.util.Scanner;

public class Question398 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a positive number (N): ");
        int n = sc.nextInt();

        // Print all powers of 2 from 2 to N
        for (int i = 1; i <= n; i *= 2) {
            System.out.print(i + " "); // Print current power number
        }

        sc.close();
    }
}
