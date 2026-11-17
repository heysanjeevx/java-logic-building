// Section 2.4 | Q269
import java.util.Scanner;

public class Question269 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a student percentage: ");
        double percent = sc.nextDouble();
        System.out.print("Enter their family annual income: ");
        double income = sc.nextDouble();

        System.out.println((percent >= 90 && income < 200000) ? "Full scholarship" :
                            (percent >= 80) ? "Partial Scholarship" : "No Scholarship");

        sc.close();
    }
}
