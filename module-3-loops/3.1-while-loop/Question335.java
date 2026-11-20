// Section 3.1 | Q335
import java.util.Scanner;

public class Question335 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer (N): ");
        int n = sc.nextInt();

        // Initialize counter variable
        int count = 0;
        while (n > 0) {
            n = n / 10; // Remove last digit
            count++; // Increment counter by 1
        }
        System.out.println("Count = " + count);

        sc.close();
    }
}
