// Section 2.2 | Q183
import java.util.Scanner;

public class Question183 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean isPerfect = false;

        for (int i = 0; i * i <= n; i++) {
            if (i * i == n) {
                isPerfect = true;
                break;
            }
        }

        if (isPerfect) {
            System.out.println("Perfect square");
        } else {
            System.out.println("Not a perfect square");
        }

        sc.close();
    }
}
