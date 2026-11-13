// Section 2.2 | Q168
import java.util.Scanner;

public class Question168 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter current hour(0 to 23) in 24-hour format: ");
        int hour = sc.nextInt();

        if (hour >= 9 && hour <= 21) {
            System.out.println("Store is open");
        } else {
            System.out.println("Store is closed");
        }
    }
}
