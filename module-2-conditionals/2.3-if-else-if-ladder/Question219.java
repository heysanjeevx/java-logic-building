// Section 2.3 | Q219
import java.util.Scanner;

public class Question219 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day number (1 to 7): ");
        int day = sc.nextInt();

        if (day < 1 || day > 7) {
            System.out.println("Invalid Day Number");
        } else if (day <= 5) {
            System.out.println("Weekday");
        } else {
            System.out.println("Weekend");
        }
        sc.close();
    }
}
