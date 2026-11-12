// Section 2.2 | Q147
import java.util.Scanner;

public class Question147 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Non-zero");
        }
    }
}
