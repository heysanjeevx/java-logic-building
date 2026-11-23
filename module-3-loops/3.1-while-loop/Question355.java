// Section 3.1 | Q355
import java.util.Scanner;

public class Question355 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer (N): ");
        int n = sc.nextInt();

        int primeCount = 0;
        int num = 2;

        while (num <= n) {
            int count = 0;
            int i = 2;

            while (i < num) {
                if (num % i == 0) {
                    count++;
                }
                i++;
            }

            if (count == 0) {
                primeCount++;
            }
            num++;
        }
        System.out.println("Total prime number is: " + primeCount);
    }
}
