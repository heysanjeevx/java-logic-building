// Section 2.3 | Q226
import java.util.Scanner;

public class Question226 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter network signal strength (1 to 5 bars): ");
        int bars = sc.nextInt();

        if (bars < 1 || bars > 5) {
            System.out.println("Invalid network signal strength");
        } else if (bars == 5) {
            System.out.println("Excellent");
        } else if (bars == 4) {
            System.out.println("Good");
        } else if (bars == 3) {
            System.out.println("Fair");
        } else if (bars == 2) {
            System.out.println("Poor");
        } else {
            System.out.println("No signal");
        }

        sc.close();
    }
}
