// Section 2.3 | Q231
import java.util.Scanner;

public class Question231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x coordinates: ");
        int x = sc.nextInt();
        System.out.print("Enter y coordinates: ");
        int y = sc.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("Origin");
        } else if (x == 0) {
            System.out.println("On Y-axis");
        } else if (y == 0) {
            System.out.println("On X-axis");
        } else if (x > 0 && y > 0) {
            System.out.println("Quadrant 1");
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrant 2");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrant 3");
        } else {
            System.out.println("Quadrant 4");
        }

        sc.close();
    }
}
