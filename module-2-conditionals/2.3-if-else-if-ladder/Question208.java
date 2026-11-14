// Section 2.3 | Q208
import java.util.Scanner;

public class Question208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter purchase amount in rupees: ");
        int amount = sc.nextInt();

        if (amount < 0) {
            System.out.println("Invalid Purchase Amount");
        } else if (amount >= 5000) {
            System.out.println("20%");
        } else if (amount >= 2000) {
            System.out.println("15%");
        } else if (amount >= 1000) {
            System.out.println("10%");
        } else if (amount >= 500) {
            System.out.println("5%");
        } else {
            System.out.println("No discount");
        }

        sc.close();
    }
}
