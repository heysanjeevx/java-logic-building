// Section 2.3 | Q199
import java.util.Scanner;

public class Question199 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter body temperature in Fahrenheit: ");
        double temperature = sc.nextDouble();

        if (temperature < 99.0) {
            System.out.println("Normal");
        } else if (temperature < 100.5) {
            System.out.println("Low Fever");
        } else if (temperature <= 103.0) {
            System.out.println("Moderate Fever");
        } else {
            System.out.println("High Fever");
        }

        sc.close();
    }
}
