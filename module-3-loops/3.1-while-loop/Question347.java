// Section 3.1 | Q347
import java.util.Scanner;

public class Question347 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers (o to stop)");
        int num = sc.nextInt();

        // Initialize max with first number
        int max = num;

        // Run loop until user enters 0
        while (num != 0) {
            if (num > max) {
                max = num; // Update maximum number
            }
            num = sc.nextInt(); // Take next input
        }
        System.out.println("Maximum number is: " + max);
    }
}
