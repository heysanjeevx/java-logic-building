// Section 3.1 | Q351
import java.util.Scanner;

public class Question351 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer number (N): ");
        int num = sc.nextInt();

        int i = 1;

        if (num <= 0) {
            System.out.println("Invalid number");
        } else {
            while (i <= 10) {
                int multi = num * i;
                System.out.println(num + " x " + i + " = " + multi);
                i++;
            }
        }
        sc.close();
    }
}
