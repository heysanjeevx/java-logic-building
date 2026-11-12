// Section 2.2 | Q159
import java.util.Scanner;

public class Question159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = a + b;

        if (sum > 100) {
            System.out.println("Sum exceeds 100");
        } else {
            System.out.println("Sum does not exceed 100");
        }
    }
}
