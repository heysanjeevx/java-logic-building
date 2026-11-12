// Section 2.2 | Q154
import java.util.Scanner;

public class Question154 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int n = sc.nextInt();

        if (n % 2 == 0 && n % 3 == 0) {
            System.out.println("Divisible by both 2 and 3");
        } else {
            System.out.println("Not divisible by both");
        }
    }
}
