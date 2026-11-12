// Section 2.1 | Q140
import java.util.Scanner;

public class Question140 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a vehicle's speed in km/h: ");
        double speed = sc.nextDouble();

        if (speed > 80) {
            System.out.println("Overspeeding! Chhallan issued.");
        }
    }
}
