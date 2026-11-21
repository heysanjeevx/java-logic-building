// Section 3.1 | Q343
import java.util.Scanner;

public class Question343 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer (N): ");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;

            int fact = 1;
            int i = 1;
            while (i <= digit) {
                fact = fact * i;
                i++;
            }
            sum = sum + fact;
            n = n / 10;
        }

        if (sum == original) {
            System.out.println("Strong");
        } else {
            System.out.println("Not strong");
        }
    }
}