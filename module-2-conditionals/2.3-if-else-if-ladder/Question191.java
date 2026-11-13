// Section 2.3 | Q191
import java.util.Scanner;

public class Question191 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your CGPA(0.0 to 10.0): ");
        double cgpa = sc.nextDouble();

        if (cgpa < 0.0 || cgpa > 10.0) {
            System.out.println("Invalid CGPA");
        } else if (cgpa >= 9.0) {
            System.out.println("Outstanding");
        } else if (cgpa >= 7.5) {
            System.out.println("First Class");
        } else if (cgpa >= 6.0) {
            System.out.println("Second Class");
        } else if (cgpa >= 5.0) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}
