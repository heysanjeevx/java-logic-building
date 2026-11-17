// Section 2.4 | Q270
import java.util.Scanner;

public class Question270 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in celsius: ");
        int temp = sc.nextInt();

        System.out.println((temp > 35) ? "Hot" : (temp < 10) ? "Cold" : "Pleasant");

        sc.close();
    }
}
