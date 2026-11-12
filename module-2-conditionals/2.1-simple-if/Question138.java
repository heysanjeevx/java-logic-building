// Section 2.1 | Q138
import java.util.Scanner;

public class Question138 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        if (salary > 50000) {
            System.out.println("High Income");
        }
    }
}
