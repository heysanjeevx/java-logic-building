// Section 3.1 | Q346
import java.util.Scanner;

public class Question346 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers (-1 to stop)");
        int num = sc.nextInt();

        int sum = 0;
        while (num != -1) {
            sum = sum + num;
            num = sc.nextInt();
        }

        System.out.println("Sum of all number: " + sum);
    }
}
