// Section 2.1 | Q134
import java.util.Scanner;

public class Question134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second integer number: ");
        int num2 = sc.nextInt();

        int product = num1 * num2;

        if (product % 2 == 0) {
            System.out.println("Product is even");
        }
    }
}
