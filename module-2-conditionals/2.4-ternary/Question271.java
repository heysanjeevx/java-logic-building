// Section 2.4 | Q271
import java.util.Scanner;

public class Question271 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = (n % 2 == 0) ? n : (n + 1);
        System.out.println(result);

        sc.close();
    }
}
