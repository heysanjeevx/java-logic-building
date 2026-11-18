// Section 2.5 | Q302
import java.util.Scanner;

public class Question302 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a travel destination code (1 to 3): ");
        int code = sc.nextInt();
        System.out.print("Enter the numbers of travelers: ");
        int travelers = sc.nextInt();

        double totalCost;

        switch (code) {
            case 1: totalCost = travelers * 15000; break;
            case 2: totalCost = travelers * 10000; break;
            case 3: totalCost = travelers * 12000; break;
            case 0:
                System.out.println("Exit");
                sc.close();
                return;
            default:
                System.out.println("Invalid travel destination code");
                sc.close();
                return;
        }
        if (travelers > 5) {
            totalCost = totalCost - (totalCost * 0.10);
        }

        System.out.println("Total Cost = " + totalCost);

        sc.close();
    }
}
