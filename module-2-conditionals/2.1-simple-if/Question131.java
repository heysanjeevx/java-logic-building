// Section 2.1 | Q131
import java.util.Scanner;

public class Question131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second integer number: ");
        int num2 = sc.nextInt();

        if (num1 > 0 && num2 > 0) {
            System.out.println("Both number are positive");
        }
    }
}
