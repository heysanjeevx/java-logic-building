// Section 3.3 | Q395
import java.util.Scanner;

public class Question395 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take inputs from user
        System.out.print("Enter a number (K): ");
        int k = sc.nextInt();
        System.out.print("Enter a limit (N): ");
        int n = sc.nextInt();

        // Print all multiples number from K to N
        for (int i = k; i <= n; i += k) {
            System.out.print(i + " "); // Print current multiple of k
        }

        sc.close();
    }
}
