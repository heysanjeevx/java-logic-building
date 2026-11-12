// Section 2.1 | Q129
import java.util.Scanner;

public class Question129 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = sc.nextInt();

        if (num % 2 == 0 && num % 4 != 0) {
            System.out.println("Divisible by 2 but not by 4");
        }
    }
}
