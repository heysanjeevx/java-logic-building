// Section 2.4 | Q258
import java.util.Scanner;

public class Question258 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = (n > 0) ? n * n : 0;
        System.out.println(result);
        sc.close();
    }
}
