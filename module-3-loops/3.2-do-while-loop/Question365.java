// Section 3.2 | Q365
import java.util.Scanner;

public class Question365 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer (N): ");
        int n = sc.nextInt();

        int i = n;
        do {
            System.out.print(i + " ");
            i--;
        } while (i > 0);
    }
}
