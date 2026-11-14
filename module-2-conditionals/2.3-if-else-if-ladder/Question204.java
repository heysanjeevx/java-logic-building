// Section 2.3 | Q204
import java.util.Scanner;

public class Question204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter daily water intake in liters: ");
        double liters = sc.nextDouble();

        if (liters < 0) {
            System.out.println("Invalid water intake");
        } else if (liters < 1) {
            System.out.println("Severely dehydrated");
        } else if (liters < 2) {
            System.out.println("Low intake");
        } else if (liters <= 3) {
            System.out.println("Good");
        } else {
            System.out.println("Excellent");
        }

        sc.close();
    }
}
