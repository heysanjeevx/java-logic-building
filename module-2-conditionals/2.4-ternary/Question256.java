// Section 2.4 | Q256
import java.util.Scanner;

public class Question256 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The user is a member (true/false): ");
        boolean isMember = sc.nextBoolean();
        System.out.print("Enter the original price: ");
        double price = sc.nextDouble();

        double finalPrice = isMember ? (price - price * 0.10) : price;
        System.out.println(finalPrice);
        sc.close();
    }
}
