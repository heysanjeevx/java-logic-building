// Section 2.1 | Q137
import java.util.Scanner;

public class Question137 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature (in Celsius): ");
        double temp = sc.nextDouble();

        if (temp > 40) {
            System.out.println("Very Hot Alert");
        }
    }
}
