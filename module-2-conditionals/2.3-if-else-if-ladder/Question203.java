// Section 2.3 | Q203
import java.util.Scanner;

public class Question203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter running speed in km/h: ");
        int speed = sc.nextInt();

        if (speed < 0) {
            System.out.println("No movement");
        } else if (speed < 5) {
            System.out.println("Walk");
        } else if (speed < 10) {
            System.out.println("Jog");
        } else if (speed <= 14) {
            System.out.println("Run");
        } else {
            System.out.println("Sprint");
        }

        sc.close();
    }
}
