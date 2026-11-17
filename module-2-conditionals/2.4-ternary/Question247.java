// Section 2.4 | Q247
import java.util.Scanner;

public class Question247 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        int min = (a < b ? a : b);
        System.out.println(min);

        sc.close();
    }
}
