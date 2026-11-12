// Section 2.2 | Q153
import java.util.Scanner;

public class Question153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int n = sc.nextInt();

        if (n >= 10 && n <= 99) {
            System.out.println("Two-digit number");
        } else {
            System.out.println("Not a two-digit number");
        }
    }
}
