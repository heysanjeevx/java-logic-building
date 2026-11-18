// Section 2.5 | Q301
import java.util.Scanner;

public class Question301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a product code (1 to 5): ");
        int productCode = sc.nextInt();
        System.out.print("Enter a product quantity: ");
        int productQuantity = sc.nextInt();

        int totalBill = 0;

        switch (productCode) {
            case 1: totalBill = productQuantity * 10; break;
            case 2: totalBill = productQuantity * 40; break;
            case 3: totalBill = productQuantity * 250; break;
            case 4: totalBill = productQuantity * 300; break;
            case 5: totalBill = productQuantity * 5; break;
        }
        System.out.println("Total Bill = " + totalBill);

        sc.close();
    }
}
