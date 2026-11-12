// Section 2.1 | Q123
import java.util.Scanner;

public class Question123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even");
        }
    }
}
