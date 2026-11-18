// Section 2.5 | Q293
import java.util.Scanner;

public class Question293 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a menu choice (1 to 4): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Checking balance..."); break;
            case 2:
                System.out.println("Processing withdrawal..."); break;
            case 3:
                System.out.println("Processing deposit..."); break;
            case 4:
                System.out.println("Thank you. Goodbye."); break;
            default:
                System.out.println("Invalid option");
        }
    }
}
