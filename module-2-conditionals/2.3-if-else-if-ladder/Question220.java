// Section 2.3 | Q220
import java.util.Scanner;

public class Question220 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year (e.g., 1900, 2000, 2024): ");
        int year = sc.nextInt();

        if (year < 1801 || year > 2100) {
            System.out.println("Invalid Year");
        } else if (year <= 1900) {
            System.out.println("19th century");
        } else if (year <= 2000) {
            System.out.println("20th century");
        } else {
            System.out.println("21st century");
        }

        sc.close();
    }
}
