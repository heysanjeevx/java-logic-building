// Section 2.2 | Q176
import java.util.Scanner;

public class Question176 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a single character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'm') {
            System.out.println("First half (a-m)");
        } else {
            System.out.println("Second half (n-z)");
        }

        sc.close();
    }
}
