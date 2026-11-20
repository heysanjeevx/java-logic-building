// Section 3.1 | Q341
import java.util.Scanner;

public class Question341 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer (N): ");
        int n = sc.nextInt();

        int i = 1;
        int sum = 0;

        while (i < n) {
            if (n % i == 0) {
                sum = sum + i;
            }
            i++;
        }

        if (sum == n) {
            System.out.println("Perfect");
        } else {
            System.out.println("Not Perfect");
        }
    }
}