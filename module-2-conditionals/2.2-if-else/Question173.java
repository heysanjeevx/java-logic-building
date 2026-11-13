// Section 2.2 | Q173
import java.util.Scanner;

public class Question173 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a single character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase");
        } else {
            System.out.println("Lowercase");
        }

        sc.close();
    }
}
