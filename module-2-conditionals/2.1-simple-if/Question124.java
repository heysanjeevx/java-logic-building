// Section 2.1 | Q124
import java.util.Scanner;

public class Question124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = sc.nextInt();

        if (num % 5 == 0) {
            System.out.println("Divisible by 5");
        }
    }
}
