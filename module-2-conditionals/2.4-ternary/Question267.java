// Section 2.4 | Q267
import java.util.Scanner;

public class Question267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        System.out.print("Enter a character operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        int result = (op == '+' ? a + b : (op == '-') ? a - b : (op == '*') ? a * b : a / b);
        System.out.println(result);

        sc.close();
    }
}
