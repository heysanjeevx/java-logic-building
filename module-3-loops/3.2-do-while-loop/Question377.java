// Section 3.2 | Q377
import java.util.Scanner;

public class Question377 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        int first = 0;
        int second = 1;

        int i = 1;
        do {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
            i++;
        } while (i <= n);
    }
}
