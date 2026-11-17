// Section 2.4 | Q260
import java.util.Scanner;

public class Question260 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int n = sc.nextInt();

        System.out.println((n == 0) ? "Zero" : (n > 0) ? "Positive" : "Negative");

        sc.close();
    }
}
