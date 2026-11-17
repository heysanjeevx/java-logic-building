// Section 2.4 | Q242
import java.util.Scanner;

public class Question242 {
    public static void main(String[] args) {

        int a = 5, b = 10, c = 7;
        int max = a > b ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(max); // Output: b = 10
    }
}
