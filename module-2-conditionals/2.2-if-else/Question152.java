// Section 2.2 | Q152
import java.util.Scanner;

public class Question152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int n = sc.nextInt();

        if (n >= 1 && n <= 100) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }
    }
}
