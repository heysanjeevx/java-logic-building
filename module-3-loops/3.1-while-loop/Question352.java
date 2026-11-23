// Section 3.1 | Q352
import java.util.Scanner;

public class Question352 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first positive integer (A): ");
        int a = sc.nextInt();
        System.out.print("Enter second positive integer (B): ");
        int b = sc.nextInt();

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("HCF/GCD = " + a);
    }
}
