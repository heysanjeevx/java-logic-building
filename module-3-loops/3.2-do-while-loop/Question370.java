// Section 3.2 | Q370
import java.util.Scanner;

public class Question370 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer (N): ");
        int n = sc.nextInt();

        int largest = 0;
        do {
            int digit = n % 10;
            if (digit > largest) {
                largest = digit;
            }
            n = n / 10;
        } while (n > 0);

        System.out.println("Largest digit: " + largest);
        sc.close();
    }
}
