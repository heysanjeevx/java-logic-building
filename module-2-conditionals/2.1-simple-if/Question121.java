// Section 2.1 | Q121
import java.util.Scanner;

public class Question121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Negative");
        }
    }
}
