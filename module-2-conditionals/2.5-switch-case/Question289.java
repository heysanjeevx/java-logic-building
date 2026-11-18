// Section 2.5 | Q289
import java.util.Scanner;

public class Question289 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a single lowercase character: ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
    }
}
