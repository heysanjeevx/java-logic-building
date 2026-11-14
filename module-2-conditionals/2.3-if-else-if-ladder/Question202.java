// Section 2.3 | Q202
import java.util.Scanner;

public class Question202 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of steps walked per day: ");
        int steps = sc.nextInt();

        if (steps < 0) {
            System.out.println("Invalid steps");
        } else if (steps < 2000) {
            System.out.println("Sedentary");
        } else if (steps < 5000) {
            System.out.println("Low Activity");
        } else if (steps <= 9999) {
            System.out.println("Moderate Activity");
        } else {
            System.out.println("Active");
        }

        sc.close();
    }
}
