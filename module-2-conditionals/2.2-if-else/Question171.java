// Section 2.2 | Q171
import java.util.Scanner;

public class Question171 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a vehicle speed in km/h: ");
        double speed = sc.nextDouble();

        if (speed <= 80) {
            System.out.println("Speed is safe");
        } else {
            System.out.println("Overspeeding detected");
        }
    }
}