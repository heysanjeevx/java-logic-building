// Section 3.2 | Q380
import java.util.Scanner;

public class Question380 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer (N): ");
        int n = sc.nextInt();

        int i = 1;
        int sum = 0;

        do {
            if (n % i == 0 && i < n) {
                sum = sum + i;
            }
            i++;

        } while (i < n);

        if (sum == n) {
            System.out.println("Perfect");
        } else {
            System.out.println("Not perfect");
        }

        sc.close();
    }
}
