// Section 2.3 | Q230
import java.util.Scanner;

public class Question230 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first angle of a triangle: ");
        int a = sc.nextInt();
        System.out.print("Enter second angle of a triangle: ");
        int b = sc.nextInt();
        System.out.print("Enter third angle of a triangle: ");
        int c = sc.nextInt();

        if ((a > 0 && b > 0 && c > 0) && ((a + b + c) == 180)) {
            if ((a == 90) || (b == 90) ||(c == 90)) {
                System.out.println("Right-angled triangle");
            } else if ((a < 90) && (b < 90) && (c < 90)) {
                System.out.println("Acute triangle");
            } else {
                System.out.println("Obtuse triangle");
            }
        } else {
            System.out.println("Invalid triangle");
        }

        sc.close();
    }
}
