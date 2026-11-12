// Section 2.1 | Q135
import java.util.Scanner;

public class Question135 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Eligible to vote");
        }
    }
}
