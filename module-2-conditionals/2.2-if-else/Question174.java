// Section 2.2 | Q174
import java.util.Scanner;

public class Question174 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a single character: ");
        char ch = sc.next().charAt(0);

        // if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
        if (Character.isLetter(ch)) {
            System.out.println("Alphabet");
        } else {
            System.out.println("Not an alphabet");
        }

        sc.close();
    }
}
