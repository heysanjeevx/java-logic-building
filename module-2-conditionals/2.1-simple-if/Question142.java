// Section 2.1 | Q142
import java.util.Scanner;

public class Question142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase letter");
        }
    }
}
