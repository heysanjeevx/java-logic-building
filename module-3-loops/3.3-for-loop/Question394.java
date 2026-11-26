// Section 3.3 | Q394
import java.util.Scanner;

public class Question394 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a positive integer (N): ");
        int n = sc.nextInt();

        // Print all odd numbers from 1 to N
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " "); // Print current odd number
        }
    }
}
