// Section 2.4 | Q253
import java.util.Scanner;

public class Question253 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a purchase amount: ");
        double amount = sc.nextDouble();

        System.out.println((amount < 0) ? "Invalid amount" : (amount >= 500) ? "Discount applied" : "No discount");
        sc.close();
    }
}
