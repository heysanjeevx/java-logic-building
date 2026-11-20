// Section 3.1 | Q326
import java.util.Scanner;

public class Question326 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer (N): ");
        int n = sc.nextInt();

        int first = 0;
        int second = 1;

        int i = 0;
        while (i < n) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
            i++;
            
        }

        sc.close();
    }
}
