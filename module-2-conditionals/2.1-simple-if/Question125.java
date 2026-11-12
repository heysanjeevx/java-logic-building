// Section 2.1 | Q125
import java.util.Scanner;

public class Question125 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Divisible by both 3 and 5");
        }
    }
}
