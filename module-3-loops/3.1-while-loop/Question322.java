// Section 3.1 | Q322
import java.util.Scanner;

public class Question322 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer (K): ");
        int k = sc.nextInt();
        System.out.print("Enter second integer (N): ");
        int n = sc.nextInt();

        int i = k;
        while (i <= n) {
            System.out.print(i+ " ");
            i += k;
        }

        sc.close();
    }
}
