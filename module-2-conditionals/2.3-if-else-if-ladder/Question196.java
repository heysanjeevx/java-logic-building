// Section 2.3 | Q196
import java.util.Scanner;

public class Question196 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of stars given by a user (1 to 5): ");
        int stars = sc.nextInt();

        if (stars < 1 || stars > 5) {
            System.out.println("Invalid Stars");
        } else if (stars == 5) {
            System.out.println("Excellent");
        } else if (stars == 4) {
            System.out.println("Good");
        } else if (stars == 3) {
            System.out.println("Average");
        } else if (stars == 2) {
            System.out.println("Bad");
        } else {
            System.out.println("Terrible");
        }

        sc.close();
    }
}
