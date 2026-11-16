// Section 2.3 | Q232
import java.util.Scanner;

public class Question232 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter annual income: ");
        double income = sc.nextDouble();
        System.out.print("Enter number of dependents: ");
        int dependents = sc.nextInt();

        if (income < 0 || dependents < 0) {
            System.out.println("Invalid input");
        } else if (income > 300000 && dependents <= 2) {
            System.out.println("Taxable");

            if (income <= 500000) {
                System.out.println("Applicable tax rate: 5%");
            } else if (income <= 10000000) {
                System.out.println("Applicable tax rate: 20%");
            } else {
                System.out.println("Applicable tax rate: 30%");
            }
        } else {
            System.out.println("Not taxable");
        }

        sc.close();
    }
}
