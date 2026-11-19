// Section 3.1 | Q316
import java.util.Scanner;

public class Question316 {
    public static void main(String[] args) {

        int n = 5678, count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        System.out.println(count);

        // Output: 4
    }
}
