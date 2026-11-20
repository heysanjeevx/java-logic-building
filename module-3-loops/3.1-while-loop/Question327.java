// Section 3.1 | Q327
import java.util.Scanner;

public class Question327 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer (N): ");
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        sc.close();
    }
}
