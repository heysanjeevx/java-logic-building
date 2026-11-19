// Section 3.1 | Q314
import java.util.Scanner;

public class Question314 {
    public static void main(String[] args) {

        int n = 1234;
        while (n > 0) {
            System.out.println(n % 10 + " ");
            n = n / 10;
        }
        // Output:
                // 4
                // 3
                // 2
                // 1
    }
}
