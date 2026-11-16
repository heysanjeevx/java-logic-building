// Section 2.3 | Q224
import java.util.Scanner;

public class Question224 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter earthquake magnitude: ");
        double magnitude = sc.nextDouble();

        if (magnitude < 0) {
            System.out.println("Invalid earthquake magnitude");
        } else if (magnitude < 2.0) {
            System.out.println("Micro - Not felt");
        } else if (magnitude < 4.0) {
            System.out.println("Minor - Rarely felt");
        } else if (magnitude < 5.0) {
            System.out.println("Light - Noticeable");
        } else if (magnitude < 6.0) {
            System.out.println("Moderate - Minor damage");
        } else {
            System.out.println("Strong - Can cause damage");
        }

        sc.close();
    }
}
