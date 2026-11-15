// Section 2.3 | Q217
import java.util.Scanner;

public class Question217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number(1 to 12): ");
        int month = sc.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Invalid month number");
        } else if (month == 2) {
            System.out.println("28 Days");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 Days");
        } else {
            System.out.println("31 Days");
        }

        sc.close();
    }
}
