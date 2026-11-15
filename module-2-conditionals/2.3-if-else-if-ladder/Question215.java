// Section 2.3 | Q215
import java.util.Scanner;

public class Question215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number (1 to 12): ");
        int month = sc.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month number");
        } else if (month == 12 || month <= 2) {
            System.out.println("Winter");
        } else if (month <= 5) {
            System.out.println("Summer");
        } else if (month <= 9) {
            System.out.println("Monsoon");
        } else {
            System.out.println("Autumn");
        }

        sc.close();
    }
}
