// Section 2.1 | Q126
import java.util.Scanner;

public class Question126 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = sc.nextInt();

        if (num >= 1 && num <= 100) {
            System.out.println("In range");
        }
    }
}
