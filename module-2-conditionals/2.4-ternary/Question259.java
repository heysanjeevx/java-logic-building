// Section 2.4 | Q259
import java.util.Scanner;

public class Question259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int n = sc.nextInt();

        int result = (n % 2 != 0) ? 1 : 0;
        System.out.println(result);

        sc.close();
    }
}
