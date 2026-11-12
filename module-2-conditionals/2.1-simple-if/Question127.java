// Section 2.1 | Q127
import java.util.Scanner;

public class Question127 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = sc.nextInt();

        if (num % 7 == 0) {
            System.out.println("Multiple of 7");
        }
    }
}
