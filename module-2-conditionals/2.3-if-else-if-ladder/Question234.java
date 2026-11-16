// Section 2.3 | Q234
import java.util.Scanner;

public class Question234 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hour (0 to 23): ");
        int hour = sc.nextInt();
        System.out.print("Enter minute (0 to 59): ");
        int minute = sc.nextInt();

        if (hour < 0 || hour > 23 || minute < 0 || minute > 59) {
            System.out.println("Invalid time");
        } else {

            if (hour < 5) {
                System.out.println("Good Night");
            } else if (hour < 12) {
                System.out.println("Good Morning");
            } else if (hour < 17) {
                System.out.println("Good Afternoon");
            } else if (hour < 21) {
                System.out.println("Good Evening");
            } else {
                System.out.println("Good Night");
            }

            if ((hour >= 9 && hour < 17) || (hour == 17 && minute == 0)) {
                System.out.println("Working hour");
            } else {
                System.out.println("Non-working hour");
            }
        }

        sc.close();
    }
}
