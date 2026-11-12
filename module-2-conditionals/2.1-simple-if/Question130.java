// Section 2.1 | Q130
import java.util.Scanner;

public class Question130 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer number: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer number: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("a is greater");
        }
    }
}
