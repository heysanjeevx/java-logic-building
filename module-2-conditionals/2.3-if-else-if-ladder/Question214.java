// Section 2.3 | Q214
import java.util.Scanner;

public class Question214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter current hour in 24-hour formate (0 to 23): ");
        int hour = sc.nextInt();

        if (hour < 0 || hour > 23) {
            System.out.println("Invalid current hour");
        } else if (hour <= 4) {
            System.out.println("Good Night");
        } else if (hour <= 11) {
            System.out.println("Good Morning");
        } else if (hour <= 16) {
            System.out.println("Good Afternoon");
        } else if (hour <= 20) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Good Night");
        }
        sc.close();
    }
}
