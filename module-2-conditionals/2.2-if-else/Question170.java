// Section 2.2 | Q170
import java.util.Scanner;

public class Question170 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();

        if (amount >= 500) {
            System.out.println("Discount applied");
        } else {
            System.out.println("No discount");
        }
    }
}
