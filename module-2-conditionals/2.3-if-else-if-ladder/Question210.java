// Section 2.3 | Q210
import java.util.Scanner;

public class Question210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter water consumption in liters: ");
        int liters = sc.nextInt();

        if (liters < 0) {
            System.out.println("Invalid Water consumption");
        } else if (liters <= 30) {
            System.out.println("Rs. 10");
        } else if (liters <= 100) {
            System.out.println("Rs. 20");
        } else if (liters <= 200) {
            System.out.println("Rs. 40");
        } else {
            System.out.println("Rs. 70");
        }

        sc.close();
    }
}
