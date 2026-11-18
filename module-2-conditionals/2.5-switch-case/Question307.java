// Section 2.5 | Q307
import java.util.Scanner;

public class Question307 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter operation ('A' = Add, 'S' = Subtract, 'M' = Multiply, 'D' = Divide, 'R' = Remainder): ");
        char op = sc.next().charAt(0);
        System.out.print("Enter first integer (a): ");
        int a = sc.nextInt();
        System.out.print("Enter second integer (b): ");
        int b = sc.nextInt();

        switch (op) {
            case 'A': System.out.println("Result = " + (a + b)); break;
            case 'S': System.out.println("Result = " + (a - b)); break;
            case 'M': System.out.println("Result = " + (a * b)); break;
            case 'D':
                if (b == 0) {
                    System.out.println("Error: Cannot divide by zero");
                } else {
                    System.out.println("Result = " + (a / b));
                }
                break;
            case 'R':
                if (b == 0) {
                    System.out.println("Error: Cannot divide by zero");
                } else {
                    System.out.println("Result = " + (a % b));
                }
                break;
            default:
                System.out.println("Invalid operation");
        }

        sc.close();
    }
}
