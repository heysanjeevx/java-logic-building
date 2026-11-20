// Section 3.1 | Q328
import java.util.Scanner;

public class Question328 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number (N): ");
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println("Total sum = " + sum);

        sc.close();
    }
}
