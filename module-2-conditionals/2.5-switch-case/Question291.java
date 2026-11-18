// Section 2.5 | Q292
import java.util.Scanner;

public class Question292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();
        System.out.print("Enter operator character: ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+': System.out.println(a + b); break;
            case '-': System.out.println(a - b); break;
            case '*': System.out.println(a * b); break;
            case '/' :
                if (b == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.println(a / b);
                }
                break;
            default: System.out.println("Invalid Operator");
        }
    }
}
