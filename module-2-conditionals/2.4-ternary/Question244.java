// Section 2.4 | Q244
import java.util.Scanner;

public class Question244 {
    public static void main(String[] args) {

        int n = 15;
        System.out.println(n % 3 == 0 && n % 5 == 0 ? "FizzBuzz" : n % 3 == 0 ? "Fizz" : n % 5 == 0 ? "Buzz"
                : String.valueOf(n)); // Output: FizzBuzz
    }
}
