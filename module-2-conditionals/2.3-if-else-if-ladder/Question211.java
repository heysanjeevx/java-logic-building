// Section 2.3 | Q211
import java.util.Scanner;

public class Question211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter restaurant bill amount: ");
        double bill = sc.nextDouble();

        if (bill < 0) {
            System.out.println("Invalid discount");
        } else {
            double dicountPercent = 0;

            if (bill > 2000) {
                dicountPercent = 30;
            } else if (bill > 1000) {
                dicountPercent = 20;
            } else if (bill > 500) {
                dicountPercent = 10;
            } else {
                dicountPercent = 0;
            }

            double discountAmount = bill * (dicountPercent / 100.0);
            double finalAmount = bill - discountAmount;

            System.out.println("Discount Amount : " + discountAmount);
            System.out.println("Final Amount: " + finalAmount);
        }

        sc.close();
    }
}
