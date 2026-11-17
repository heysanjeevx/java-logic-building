// Section 2.4 | Q248
import java.util.Scanner;

public class Question248 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int n = sc.nextInt();

        System.out.println(n >= 0 ? n : -n);

        sc.close();
    }
}
