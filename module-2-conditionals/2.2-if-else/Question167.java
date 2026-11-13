// Section 2.2 | Q167
import java.util.Scanner;

public class Question167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the account balance: ");
        double balance = sc.nextDouble();
        System.out.print("Enter the withdrawal amount: ");
        double withdrawal = sc.nextDouble();

        if (balance >= withdrawal) {
            System.out.println("Transaction approved");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
