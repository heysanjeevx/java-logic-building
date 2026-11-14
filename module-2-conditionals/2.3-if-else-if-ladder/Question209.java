// Section 2.3 | Q209
import java.util.Scanner;

public class Question209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of units of electricity consumed: ");
        int units = sc.nextInt();

        if (units < 0) {
            System.out.println("Invalid Units");
        } else {
            int rate;

            if (units <= 100) {
                rate = 1;
            } else if (units <= 200) {
                rate = 2;
            } else if (units <= 300) {
                rate = 3;
            } else {
                rate = 5;
            }
            int totalBill = units * rate;
            System.out.println("Total Bill: Rs. " + totalBill);
        }
        sc.close();
    }
}
