// Section 2.2 | Q149
import java.util.Scanner;

public class Question149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int n = sc.nextInt();

        if (n % 7 == 0) {
            System.out.println("Divisible by 7");
        } else {
            System.out.println("Not divisible by 7");
        }
    }
}
