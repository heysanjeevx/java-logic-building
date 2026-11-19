// Section 3.1 | Q325
import java.util.Scanner;

public class Question325 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer (N): ");
        int n = sc.nextInt();

        int p = 1;
        while (p <= n) {
            System.out.print(p + " ");
            p = p * 2;
        }

        sc.close();
    }
}
