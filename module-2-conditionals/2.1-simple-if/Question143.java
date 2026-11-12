// Section 2.1 | Q143
import java.util.Scanner;

public class Question143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character digit: ");
        char ch = sc.next().charAt(0);

        if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        }
    }
}
