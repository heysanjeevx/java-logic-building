// Section 2.3 | Q222
import java.util.Scanner;

public class Question222 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fuel level as a percentage (0 to 100): ");
        int fuel = sc.nextInt();
        
        if (fuel < 0 || fuel > 100) {
            System.out.println("Invalid fuel level");
        } else if (fuel > 75) {
            System.out.println("Full");
        } else if (fuel >= 50) {
            System.out.println("Good");
        } else if (fuel >= 25) {
            System.out.println("Sufficient");
        } else if (fuel >= 10) {
            System.out.println("Low - Refuel soon");
        } else {
            System.out.println("Critical - Refuel immediately");
        }

        sc.close();
    }
}
