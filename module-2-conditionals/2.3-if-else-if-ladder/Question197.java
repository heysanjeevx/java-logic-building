// Section 2.3 | Q197
import java.util.Scanner;

public class Question197 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a person age: ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Invalid age");
        } else if (age < 13) {
            System.out.println("Child");
        } else if (age <= 17) {
            System.out.println("Teenager");
        } else if (age <= 59) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }

        sc.close();
    }
}
