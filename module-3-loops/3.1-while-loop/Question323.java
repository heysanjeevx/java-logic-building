// Section 3.1 | Q323
import java.util.Scanner;

public class Question323 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter second integer (N): ");
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            System.out.print(i * i+ " ");
            i++;
        }

        sc.close();
    }
}
