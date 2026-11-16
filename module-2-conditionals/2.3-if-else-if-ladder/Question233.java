// Section 2.3 | Q233
import java.util.Scanner;

public class Question233 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Negative");
        } else if (num == 0) {
            System.out.println("Zero");
        } else if (num % 2 == 0) {
            System.out.println("Positive Even");
        } else {
            System.out.println("Positive Odd");
        }

        sc.close();
    }
}
