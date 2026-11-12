// Section 2.2 | Q150
import java.util.Scanner;

public class Question150 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int n = sc.nextInt();

        if (n % 11 == 0) {
            System.out.println("Divisible by 11");
        } else {
            System.out.println("Not divisible by 11");
        }
    }
}
