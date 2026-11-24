// Section 3.2 | Q373
import java.util.Scanner;

public class Question373 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char choice;

        do {
            System.out.println("- - - Real World Calculator - - -");

            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            System.out.print("Enter Operator: ");
            char op = sc.next().charAt(0);

            int result = 0;
            switch (op) {
                case '+': result = num1 + num2;
                    System.out.println("Sum = " + result);
                    break;
                case '-': result = num1 - num2;
                    System.out.println("Subtract = " + result);
                    break;
                case '*': result = num1 * num2;
                    System.out.println("Multiply = " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println();
                        System.out.println("Divide = " + result);
                    } else {
                        System.out.println("Cannot divide by zero");
                    }
                    break;
                case '%':
                    if (num2 != 0) {
                        result = num1 % num2;
                        System.out.println("Modulo = " + result);
                    } else {
                        System.out.println("Modulo = " + result);
                    }
                    break;
                default:
                        System.out.println("Invalid Operator");
            }

            System.out.print("Do you want to calculate again? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');
    }
}
