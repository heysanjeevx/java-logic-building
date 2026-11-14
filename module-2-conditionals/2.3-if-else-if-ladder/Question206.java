// Section 2.3 | Q206
import java.util.Scanner;

public class Question206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter monthly salary in rupees: ");
        int salary = sc.nextInt();

        if (salary < 0) {
            System.out.println("Invalid monthly salary");
        } else if (salary < 15000) {
            System.out.println("Poor");
        } else if (salary < 30000) {
            System.out.println("Average");
        } else if (salary < 50000) {
            System.out.println("Good");
        } else {
            System.out.println("Excellent");
        }
        sc.close();
    }
}
