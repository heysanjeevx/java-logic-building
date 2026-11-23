// Section 3.1 | Q353
import java.util.Scanner;

public class Question353 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first positive integer (A): ");
        int a = sc.nextInt();
        System.out.print("Enter second positive integer (B): ");
        int b = sc.nextInt();

        int multiple = a * b;

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        int lcm = multiple / a;
        System.out.println("LCM = " + lcm);

        sc.close();
    }
}
