// Section 3.1 | Q349
import java.util.Scanner;

public class Question349 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers (-1 to stop)");
        int num = sc.nextInt();

        // Initialize sum and count variable
        int sum = 0;
        int count = 0;

        // Run loop until user enters -1
        while (num != -1) {
            sum = sum + num; // Add num to sum
            count++; // Increment count by 1
            num = sc.nextInt(); // Take next input
        }

        // Check if no number are enter
        if (count == 0) {
            System.out.println("No numbers entered");
        } else {
            double avg = (double) sum / count; // Calculate average
            System.out.println("Average = " + avg);
        }
    }
}