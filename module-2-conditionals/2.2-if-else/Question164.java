// Section 2.2 | Q164
import java.util.Scanner;

public class Question164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Eligible to drive");
        } else {
            System.out.println("Not eligible to drive");
        }
    }
}
