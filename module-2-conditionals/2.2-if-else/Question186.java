// Section 2.2 | Q186
import java.util.Scanner;

public class Question186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter person age: ");
        int age = sc.nextInt();
        System.out.print("They are a citizen: ");
        boolean isCitizen = sc.nextBoolean();

        if (age >= 18 && isCitizen) {
            System.out.println("Can vote");
        } else {
            System.out.println("Cannot vote");
        }

        sc.close();
    }
}
