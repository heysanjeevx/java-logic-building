// Section 2.2 | Q181
import java.util.Scanner;

public class Question181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the breadth of rectangle: ");
        double breadth = sc.nextDouble();

        double area = length * breadth;

        if (area > 500) {
            System.out.println("Large rectangle");
        } else {
            System.out.println("Small rectangle");
        }

        sc.close();
    }
}
