// Section 2.3 | Q229
import java.util.Scanner;

public class Question229 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first side of a triangle: ");
        int a = sc.nextInt();
        System.out.print("Enter second side of a triangle: ");
        int b = sc.nextInt();
        System.out.print("Enter third side of a triangle: ");
        int c = sc.nextInt();

        if ((a + b >= c) && (b + c >= a) && (a + c >= b)) {
            if ((a == b) && (b == c)) {
                System.out.println("Equilateral");
            } else if ((a == b) || (b == c) || (a == c)) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Invalid triangle");
        }

        sc.close();
    }
}
