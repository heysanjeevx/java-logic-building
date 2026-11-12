// Section 2.1 | Q139
import java.util.Scanner;

public class Question139 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the account balance: ");
        double balance = sc.nextDouble();
        System.out.print("Enter the withdrawal amount: ");
        double withdrawal = sc.nextDouble();

        if (balance >= withdrawal) {
            System.out.println("Transaction approved");
        }
    }
}
