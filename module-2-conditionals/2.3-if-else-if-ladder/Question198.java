// Section 2.3 | Q198
import java.util.Scanner;

public class Question198 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter BMI value (decimal number): ");
        double bmi = sc.nextDouble();

        if (bmi < 0) {
            System.out.println("invalid BMI");
        } else if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25.5) {
            System.out.println("Normal");
        } else if (bmi < 30.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

        sc.close();
    }
}
