// Section 2.4 | Q262
import java.util.Scanner;

public class Question262 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();
        System.out.print("Enter third number (c): ");
        int c = sc.nextInt();

        int min = ((a <= b) && (a <= c) ? a : (b <= c) ? b : c);
        System.out.println(min);

        sc.close();
    }
}
