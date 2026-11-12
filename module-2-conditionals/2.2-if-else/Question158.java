// Section 2.2 | Q158
import java.util.Scanner;

public class Question158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("First is greater");
        } else {
            if (a < b) {
                System.out.println("Second is greater");
            } else {
                System.out.println("Both are equal");
            }
        }
    }
}
