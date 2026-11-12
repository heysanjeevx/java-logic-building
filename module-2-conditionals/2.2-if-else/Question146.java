// Section 2.2 | Q146
import java.util.Scanner;

public class Question146 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int n = sc.nextInt();

        // Assume the input will never be zero
        if (n > 0) {
            System.out.println("positive");
        } else {
            System.out.println("Negative");
        }
    }
}
