// Section 3.2 | Q376
import java.util.Scanner;

public class Question376 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        do {
            System.out.print("Enter a positive number: ");
            num = sc.nextInt();

            if (num <= 0) {
                System.out.println("Invalid. Enter a positive number.");
            } else {
                System.out.println("Valid input: " + num);
            }
        } while (num <= 0);

        sc.close();
    }
}
