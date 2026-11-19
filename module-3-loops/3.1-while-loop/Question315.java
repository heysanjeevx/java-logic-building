// Section 3.1 | Q315
import java.util.Scanner;

public class Question315 {
    public static void main(String[] args) {

        int n = 1;
        while (n <= 32) {
            System.out.print(n + " "); // Output: 1 2 4 8 16 32
            n = n * 2;
        }
    }
}
