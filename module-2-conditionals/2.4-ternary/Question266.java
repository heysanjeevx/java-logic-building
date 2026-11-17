// Section 2.4 | Q266
import java.util.Scanner;

public class Question266 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println((n == 0) ? "0" : (n > 0) ? "+" : "-");

        sc.close();
    }
}
