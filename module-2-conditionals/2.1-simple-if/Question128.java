// Section 2.1 | Q128
import java.util.Scanner;

public class Question128 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = sc.nextInt();

        if (num > 1000) {
            System.out.println("Large number");
        }
    }
}
