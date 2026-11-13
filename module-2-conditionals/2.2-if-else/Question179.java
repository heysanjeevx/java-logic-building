// Section 2.2 | Q179
import java.util.Scanner;

public class Question179 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first side of a triangle: ");
        int a = sc.nextInt();
        System.out.print("Enter the second side of a triangle: ");
        int b = sc.nextInt();
        System.out.print("Enter the third side of a triangle: ");
        int c = sc.nextInt();

        if ((a + b > c) && (b + c > a) && (a + c > b)) {
            System.out.println("Valid triangle");
        } else {
            System.out.println("Invalid triangle");
        }

        sc.close();
    }
}
