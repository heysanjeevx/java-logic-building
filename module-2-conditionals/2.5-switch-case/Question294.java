// Section 2.5 | Q294
import java.util.Scanner;

public class Question294 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a menu choice (1 to 4): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the radius of a cricle: ");
                int radius = sc.nextInt();
                System.out.println("Area = " + Math.PI * radius * radius);
                break;
            case 2:
                System.out.print("Enter the length of a rectangle: ");
                int length = sc.nextInt();
                System.out.print("Enter the breadth of a rectangle: ");
                int breadth = sc.nextInt();
                System.out.println("Area = " + (length * breadth));
                break;
            case 3:
                System.out.print("Enter the base of a triangle: ");
                int base = sc.nextInt();
                System.out.print("enter the height of a triangle: ");
                int height = sc.nextInt();
                System.out.println("Area = " + (0.5 * base * height));
                break;
            case 4:
                System.out.print("Enter the side of square: ");
                int side = sc.nextInt();
                System.out.println("Area = " + (side * side));
                break;
            case 0:
                System.out.println("Exiting.");
            default:
                System.out.println("Invalid option.");
        }
    }
}
