// Section 2.2 | Q162
import java.util.Scanner;

public class Question162 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a % 2 == 0 && b % 2 == 0) {
            System.out.println("Both are even");
        } else {
            System.out.println("Not both are even");
        }
    }
}
