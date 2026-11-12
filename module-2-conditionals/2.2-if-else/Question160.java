// Section 2.2 | Q160
import java.util.Scanner;

public class Question160 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int product = a * b;

        if (product % 2 == 0) {
            System.out.println("Product is even");
        } else {
            System.out.println("Product is odd");
        }
    }
}
