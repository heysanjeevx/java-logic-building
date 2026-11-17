// Section 2.4 | Q255
import java.util.Scanner;

public class Question255 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a person age: ");
        int age = sc.nextInt();
        System.out.print("Enter a movie ticket price: ");
        int price = sc.nextInt();

        int finalPrice = (age < 12 || age > 60) ? price / 2 : price;
        System.out.println(finalPrice);

        sc.close();
    }
}
