// Section 3.1 | Q337
import java.util.Scanner;

public class Question337 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer (N): ");
        int n = sc.nextInt();

        // Initialize product variable
        int product = 1;
        while (n > 0) {
            int digit = n % 10; // Extract last digit
            product = product * digit; // Multiply digit in product
            n = n / 10; // Remove last digit
        }
        System.out.println("Product of digits: " + product);

        sc.close();
    }
}
