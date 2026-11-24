// Section 3.2 | Q364
import java.util.Scanner;

public class Question364 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer (N): ");
        int n = sc.nextInt();

        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= n);
    }
}
