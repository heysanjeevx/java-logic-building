// Section 3.1 | Q319
import java.util.Scanner;

public class Question319 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        int i = 1;
        while (n >= i) {
            System.out.print(n + " ");
            n--;
        }

        sc.close();
    }
}
