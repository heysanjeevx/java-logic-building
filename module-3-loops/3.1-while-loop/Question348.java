// Section 3.1 | Q348
import java.util.Scanner;

public class Question348 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers (999 to stop)");
        int num = sc.nextInt();

        // Initialize count variable
        int count = 0;

        // Run loop until user enter 999
        while (num != 999) {
            if (num > 0) {
                count++; // Count positive number
            }
            num = sc.nextInt(); // Take next input
        }
        System.out.println("Total positive number is: " + count);
    }
}
