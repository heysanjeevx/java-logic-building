// Section 3.1 | Q340
import java.util.Scanner;

public class Question340 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer (N): ");
        int n = sc.nextInt();

        int original = n;
        int count = 0;

        while (n > 0) {
            n = n / 10;
            count++;
        }

        n = original;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum = sum + (int) Math.pow(digit, count);
            n = n / 10;
        }

        if (sum == original) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not a Armstrong number");
        }

        sc.close();
    }
}
