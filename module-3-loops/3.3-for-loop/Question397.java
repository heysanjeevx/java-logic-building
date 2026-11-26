// Section 3.3 | Q397
import java.util.Scanner;

public class Question397 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a positive number (N): ");
        int n = sc.nextInt();

        // Print all cube numbers from 1 to N
        for (int i = 1; i <= n; i++) {
            int cube = (i * i * i); // Build cube number
            System.out.print(cube + " "); // Print current cube number
        }

        sc.close();
    }
}
