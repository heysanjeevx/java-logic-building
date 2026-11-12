// Section 2.2 | Q151
import java.util.Scanner;

public class Question151 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int n = sc.nextInt();

        if (n % 10 == 0) {
            System.out.println("Ends with 0");
        } else {
            System.out.println("Does not end with 0");
        }
    }
}
