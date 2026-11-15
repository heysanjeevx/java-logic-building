// Section 2.3 | Q221
import java.util.Scanner;

public class Question221 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vehicle speed in km/h: ");
        int speed = sc.nextInt();

        if (speed < 0) {
            System.out.println("Invalid vehicle speed");
        } else if (speed <= 40) {
            System.out.println("Safe speed");
        } else if (speed <= 60) {
            System.out.println("Drive carefully");
        } else if (speed <= 80) {
            System.out.println("Overspeeding - Warning issued");
        } else {
            System.out.println("Challan will be issued");
        }

        sc.close();
    }
}
