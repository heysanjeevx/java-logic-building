// Section 2.4 | Q252
import java.util.Scanner;

public class Question252 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day number (1 to 7): ");
        int day = sc.nextInt();

        System.out.println((day < 1 || day > 7) ? "Invalid day" : (day <= 5) ? "Weekday" : "Weekend");
        sc.close();
    }
}
