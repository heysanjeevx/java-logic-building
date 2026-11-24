// Section 3.2 | Q369
import java.util.Scanner;

public class Question369 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer (N): ");
        int n = sc.nextInt();

        int count = 0;
        do {
            count++;
            n = n / 10;
        } while (n > 0);

        System.out.println("Total count = " + count);

        sc.close();
    }
}
