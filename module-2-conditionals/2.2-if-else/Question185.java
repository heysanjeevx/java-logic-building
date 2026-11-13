// Section 2.2 | Q185
import java.util.Scanner;

public class Question185 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int larger, smaller;

        if (a > b) {
            larger = a;
            smaller = b;
        } else {
            larger = b;
            smaller = a;
        }

        if (larger > 2 * smaller) {
            System.out.println("More than double");
        } else {
            System.out.println("Not more than double");
        }

        sc.close();
    }
}
