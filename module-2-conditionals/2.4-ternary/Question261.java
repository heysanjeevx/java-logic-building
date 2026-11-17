// Section 2.4 | Q261
import java.util.Scanner;

public class Question261 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();
        System.out.print("Enter third number (c): ");
        int c = sc.nextInt();

        int max = ((a >= b) && (a >= c) ? a : (b >= c) ? b : c);
        System.out.println(max);

        sc.close();
    }
}
