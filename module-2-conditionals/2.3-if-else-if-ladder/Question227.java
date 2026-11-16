// Section 2.3 | Q227
import java.util.Scanner;

public class Question227 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Negative");
        } else if (num == 0) {
            System.out.println("Zero");
        } else if (num <= 9) {
            System.out.println("Single digit positive");
        } else if (num <= 99) {
            System.out.println("Double digit");
        } else if (num <= 999) {
            System.out.println("Triple digit");
        } else {
            System.out.println("Large number");
        }

        sc.close();
    }
}
