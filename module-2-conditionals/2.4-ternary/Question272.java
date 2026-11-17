// Section 2.4 | Q272
import java.util.Scanner;

public class Question272 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        System.out.println((a % 2 == 0) && (b % 2 == 0) ? "Both even" :
                            (a % 2 != 0) && (b % 2 != 0) ? "Both odd" : "Mixed") ;

        sc.close();
    }
}
