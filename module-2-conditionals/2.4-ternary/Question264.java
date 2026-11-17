// Section 2.4 | Q264
import java.util.Scanner;

public class Question264 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a age: ");
        int age = sc.nextInt();

        System.out.println((age < 0) ? "Invalid age" : (age < 13) ? "Child" : (age <= 17) ? "Teen" : "Adult");

        sc.close();
    }
}
