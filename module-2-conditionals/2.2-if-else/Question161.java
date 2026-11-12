// Section 2.2 | Q161
import java.util.Scanner;

public class Question161 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if ((a > 0 && b > 0) || (a < 0 && b < 0)) {
            System.out.println("Same sign");
        } else {
            System.out.println("Different sign");
        }
    }
}
