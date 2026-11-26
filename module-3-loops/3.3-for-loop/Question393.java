// Section 3.3 | Q393
import java.util.Scanner;

public class Question393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a positive integer (N): ");
        int n = sc.nextInt();

        // Print all even numbers from 2 to N
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " "); // Print current even number
        }

        sc.close();
    }
}
