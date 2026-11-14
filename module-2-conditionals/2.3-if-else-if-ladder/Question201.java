// Section 2.3 | Q201
import java.util.Scanner;

public class Question201 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your hours of sleep per night: ");
        double hours = sc.nextDouble();

        if (hours < 0 || hours > 24) {
            System.out.println("Invalid hours");
        } else if (hours < 6) {
            System.out.println("Too little sleep");
        } else if (hours < 7) {
            System.out.println("Slightly below ideal");
        } else if (hours <= 9) {
            System.out.println("Ideal");
        } else {
            System.out.println("Too much sleep");
        }

        sc.close();
    }
}
