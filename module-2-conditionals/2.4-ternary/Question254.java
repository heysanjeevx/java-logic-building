// Section 2.4 | Q254
import java.util.Scanner;

public class Question254 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a vehicle speed in km/h: ");
        int speed = sc.nextInt();

        System.out.println((speed < 0) ? "Invalid Speed" : (speed <= 80) ? "Safe" : "Overspeeding");

        sc.close();
    }
}
