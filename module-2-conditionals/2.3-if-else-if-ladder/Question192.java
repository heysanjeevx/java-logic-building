// Section 2.3 | Q192
import java.util.Scanner;

public class Question192 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your attendance percentage: ");
        int attend = sc.nextInt();

        if (attend < 0 || attend > 100) {
            System.out.println("Invalid Attendance Percentage");
        } else if (attend >= 90) {
            System.out.println("Excellent");
        } else if (attend >= 75) {
            System.out.println("Good");
        } else if (attend >= 60) {
            System.out.println("Average");
        } else {
            System.out.println("Barred from exam");
        }

        sc.close();
    }
}
