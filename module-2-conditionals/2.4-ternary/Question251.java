// Section 2.4 | Q251
import java.util.Scanner;

public class Question251 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int n = sc.nextInt();

        System.out.println((n >= 1 && n <= 100) ? "In range" : "Out of range");
        sc.close();
    }
}
