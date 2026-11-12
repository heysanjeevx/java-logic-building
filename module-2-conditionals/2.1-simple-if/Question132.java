// Section 2.1 | Q132
import java.util.Scanner;

public class Question132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second integer number: ");
        int num2 = sc.nextInt();

        if (num1 % 2 == 0 && num2 % 2 == 0) {
            System.out.println("Both numbers are even");
        }
    }
}
