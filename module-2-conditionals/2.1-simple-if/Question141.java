// Section 2.1 | Q141
import java.util.Scanner;

public class Question141 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Vowel");
        }
    }
}
