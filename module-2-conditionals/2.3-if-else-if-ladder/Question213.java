// Section 2.3 | Q213
import java.util.Scanner;

public class Question213 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a person budget per night for a hotel: ");
        int budget = sc.nextInt();

        if (budget < 500) {
            System.out.println("Dormitory");
        } else if (budget < 1500) {
            System.out.println("Budget Room");
        } else if (budget < 3000) {
            System.out.println("Standard Room");
        } else {
            System.out.println("Deluxe Room");
        }

        sc.close();
    }
}
