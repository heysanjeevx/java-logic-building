// Section 2.3 | Q228
import java.util.Scanner;

public class Question228 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = sc.nextInt();

        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println("Divisible by both 2 and 3");
        } else if (num % 2 == 0) {
            System.out.println("Divisible by 2");
        } else if (num % 3 == 0) {
            System.out.println("Divisible by 3");
        } else {
            System.out.println("Not divisible by 2 or 3");
        }

        sc.close();
    }
}
