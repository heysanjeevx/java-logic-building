// Section 3.1 | Q342
import java.util.Scanner;

public class Question342 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer (N): ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Not prime");
        } else {
            int i = 2;
            int count = 0;

            while (i < n) {
                if (n % i == 0) {
                    count++;
                }
                i++;
            }
            if (count == 0) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
    }
}
