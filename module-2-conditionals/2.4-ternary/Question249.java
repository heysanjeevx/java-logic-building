// Section 2.4 | Q249
import java.util.Scanner;

public class Question249 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a person age: ");
        int age = sc.nextInt();

        System.out.println(age >= 18 ? "Eligible to vote" : "Not eligible to vote");

        sc.close();
    }
}
