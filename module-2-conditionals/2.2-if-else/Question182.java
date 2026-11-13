// Section 2.2 | Q182
import java.util.Scanner;

public class Question182 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = a + b;

        if ((a > 0 && b > 0) && sum < 100){
            System.out.println("Both positive and sum under 100");
        } else {
            System.out.println("Condition not met");
        }

        sc.close();
    }
}
