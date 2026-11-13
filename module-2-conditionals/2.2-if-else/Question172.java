// Section 2.2 | Q172
import java.util.Scanner;

public class Question172 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of units os electricity consumed: ");
        int units = sc.nextInt();

        int bill;

        if (units <= 100) {
            bill = 1 * units;
        } else {
            bill = 2 * units;
        }

        System.out.println("Total bill: Rs. " + bill);
        sc.close();
    }
}
