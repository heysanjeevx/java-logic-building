// Section 2.2 | Q180
import java.util.Scanner;

public class Question180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a person current salary: ");
        double salary = sc.nextDouble();

        double newSalary = salary + (salary * 0.20);

        if (newSalary > 50000) {
            System.out.println("Salary will exceed 50000 after hike");
        } else {
            System.out.println("Salary will not exceed 50000 after hike");
        }

        sc.close();
    }
}
