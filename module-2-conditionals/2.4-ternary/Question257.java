// Section 2.4 | Q257
import java.util.Scanner;

public class Question257 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        int larger = (a > b) ? a : b;
        int smaller = (a < b) ? a : b;

        System.out.println("Larger value: " + larger);
        System.out.println("Smaller value: " + smaller);

        sc.close();
    }
}
