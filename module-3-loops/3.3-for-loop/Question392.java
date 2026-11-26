// Section 3.3 | Q392
import java.util.Scanner;

public class Question392 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a positive number (N): ");
        int n = sc.nextInt();

        // Print numbers from N to 1
        for (int i = 1; i <= n; n--) {
            System.out.print(n + " "); // Print current number
        }
    }
}
