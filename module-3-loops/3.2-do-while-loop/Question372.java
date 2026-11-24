// Section 3.2 | Q372
import java.util.Scanner;

public class Question372 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 10000;
        int choice;

        do {
            System.out.println("- - - ATM MENU - - -\n" +
                    "1. Check Balance\n" +
                    "2. Deposit Money\n" +
                    "3. Withdraw Money\n" +
                    "4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            System.out.println();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: " + balance);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double amount = sc.nextDouble();
                    balance = balance + amount;
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    amount = sc.nextDouble();

                    if (amount <= balance) {
                        balance = balance - amount;
                    } else {
                        System.out.println("Insufficient Balance");
                    }

                    break;
                case 4:
                    System.out.println("Thank you. Goodbye.");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);

        sc.close();
    }
}
