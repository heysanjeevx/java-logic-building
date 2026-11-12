// Section 2.1 | Q133
import java.util.Scanner;

public class Question133 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second integer number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        if (sum > 100) {
            System.out.println("Sum exceeds");
        }
    }
}
