// Section 3.2 | Q366
import java.util.Scanner;

public class Question366 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer (N): ");
        int n = sc.nextInt();

        // Initialize counter with first even number
        int i = 2;

        // Print even numbers from 2 to N
        do {
            System.out.print(i + " "); // Print current even number
            i += 2; // increment counter by 2
        } while (i <= n);

        sc.close();
    }
}
