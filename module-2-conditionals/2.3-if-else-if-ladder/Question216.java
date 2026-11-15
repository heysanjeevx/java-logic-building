// Section 2.3 | Q216
import java.util.Scanner;

public class Question216 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number (0 to 12): ");
        int month = sc.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month");
        } else if (month <= 3) {
            System.out.println("Quarter 1");
        } else if (month <= 6) {
            System.out.println("Quarter 2");
        } else if (month <= 9) {
            System.out.println("Quarter 3");
        } else {
            System.out.println("Quarter 4");
        }

        sc.close();
    }
}
