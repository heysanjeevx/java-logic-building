// Section 2.3 | Q205
import java.util.Scanner;

public class Question205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter annual income in rupees: ");
        int income = sc.nextInt();

        if (income < 0) {
            System.out.println("Invalid Income");
        } else if (income <= 250000) {
            System.out.println("No Tax");
        } else if (income <= 500000) {
            System.out.println("5%");
        } else if (income <= 1000000) {
            System.out.println("20%");
        } else {
            System.out.println("30%");
        }

        sc.close();
    }
}
