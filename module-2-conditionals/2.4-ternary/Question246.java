// Section 2.4 | Q246
import java.util.Scanner;

public class Question246 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        int max = a > b ? a : b;
        System.out.println(max);

        sc.close();
    }
}
